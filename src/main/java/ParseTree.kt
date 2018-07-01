import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Vocabulary
import org.antlr.v4.runtime.tree.TerminalNode
import java.io.StringReader
import java.util.*

fun parseCode(code: String) : MiniCalcParser.MiniCalcFileContext
        = MiniCalcParser(CommonTokenStream(lexerForCode(code))).miniCalcFile()

abstract class ParseTreeElement {
    abstract fun multiLineString(indendation: String = ""): String
}

class ParseTreeLeaf(val type: String, val text: String) : ParseTreeElement() {
    override fun multiLineString(indendation: String) = "${indendation}T:$type[$text]\n"

    override fun toString(): String {
        return "T:$type[$text]"
    }
}

class ParseTreeNode(val name: String) : ParseTreeElement() {
    private val children = LinkedList<ParseTreeElement>()
    fun addChild(c: ParseTreeElement): ParseTreeNode {
        children.add(c)
        return this
    }

    override fun toString(): String {
        return "Node($name) $children"
    }

    override fun multiLineString(indendation: String): String {
        return StringBuilder()
                .apply {
                    append("$indendation$name\n")
                    children.forEach { c -> append(c.multiLineString(indendation + "  ")) }
                }
                .toString()
    }
}

fun toParseTree(node: ParserRuleContext, vocabulary: Vocabulary) : ParseTreeNode {
    val res = ParseTreeNode(node.javaClass.simpleName.removeSuffix("Context"))
    node.children.forEach {
        when (it) {
            is ParserRuleContext -> res.addChild(toParseTree(it, vocabulary))
            is TerminalNode -> res.addChild(ParseTreeLeaf(vocabulary.getSymbolicName(it.symbol.type), it.text))
        }
    }
    return res
}

fun main(args: Array<String>) {
    println(toParseTree(parseCode(readExampleCode()), MiniCalcParser.VOCABULARY).multiLineString())
}