import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.Token
import java.io.FileInputStream
import java.io.StringReader

fun lexerForCode(code: String) = MiniCalcLexer(ANTLRInputStream(StringReader(code)))

fun readExampleCode() =
        FileInputStream("examples/rectangle.mc")
                .bufferedReader()
                .use {
                    it.readText()
                }

fun main(args: Array<String>) {
    val lexer = lexerForCode(readExampleCode())

    var token: Token?
    do {
        token = lexer.nextToken()
        val typeName = MiniCalcLexer.VOCABULARY.getSymbolicName(token.type)
        val text = token.text
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t")
        println("L${token.line}(${token.startIndex}-${token.stopIndex}) $typeName '$text'")
    } while (token?.type != -1)

}