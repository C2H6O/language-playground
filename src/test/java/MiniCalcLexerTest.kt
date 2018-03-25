import net.doubov.minicalc.MiniCalcLexer
import org.antlr.v4.runtime.ANTLRInputStream
import org.junit.Test
import java.io.StringReader
import java.util.*
import kotlin.test.assertEquals

fun tokensContent(lexer: MiniCalcLexer): List<String> {
    val tokens = LinkedList<String>()
    do {
        val t = lexer.nextToken()
        when (t.type) {
            -1 -> tokens.add("EOF")
            else -> if (t.type != MiniCalcLexer.WS) tokens.add(lexer.text)
        }

    } while (t.type != -1)
    return tokens
}

fun lexerForCode(code: String) = MiniCalcLexer(ANTLRInputStream(StringReader(code)))

fun tokensNames(lexer: MiniCalcLexer): List<String> {

    val tokens = LinkedList<String>()
    do {
        val t = lexer.nextToken()
        when (t.type) {
            -1 -> tokens.add("EOF")
            else -> if (t.type != MiniCalcLexer.WS) tokens.add(lexer.vocabulary.getSymbolicName(t.type))
        }

    } while (t.type != -1)
    return tokens
}

class MiniCalcLexerTest {

    @Test
    fun `parse var declaration assigned an integer literal`() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "INTLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1")))
    }

    @Test
    fun `parse var declaration assigned a decimal literal`() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "DECLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1.23"))
        )
    }

    @Test
    fun `parse var declaration assigned a sum`() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "INTLIT", "PLUS", "INTLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1 + 2"))
        )
    }

    @Test
    fun `parse mathematical expression`() {
        assertEquals(
                listOf("INTLIT", "PLUS", "ID", "ASTERISK", "INTLIT", "DIVISION", "INTLIT", "MINUS", "INTLIT", "EOF"),
                tokensNames(lexerForCode("1 + a * 3 / 4 - 5"))
        )
    }

    @Test
    fun `parse mathematical expression with parenthesis`() {
        assertEquals(
                listOf("INTLIT", "PLUS", "LPAREN", "ID", "ASTERISK", "INTLIT", "RPAREN", "MINUS", "DECLIT", "EOF"),
                tokensNames(lexerForCode("1 + (a * 3) - 5.12")))
    }

    @Test
    fun `parse casting`() {
        assertEquals(
                listOf("ID", "ASSIGN", "ID", "AS", "INT", "EOF"),
                tokensNames(lexerForCode("a = b as Int"))
        )
    }

    @Test
    fun `parse simple string`() {
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode("\"hi!\""))
        )
    }

}