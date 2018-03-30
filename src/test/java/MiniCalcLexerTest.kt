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
    fun parseVarDeclarationAssignedAnIntegerLiteral() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "INTLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1")))
    }

    @Test
    fun parseVarDeclarationAssignedADecimalLiteral() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "DECLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1.23")))
    }

    @Test
    fun parseVarDeclarationAssignedASum() {
        assertEquals(
                listOf("VAR", "ID", "ASSIGN", "INTLIT", "PLUS", "INTLIT", "EOF"),
                tokensNames(lexerForCode("var a = 1 + 2")))
    }

    @Test
    fun parseMathematicalExpression() {
        assertEquals(
                listOf("INTLIT", "PLUS", "ID", "ASTERISK", "INTLIT", "DIVISION", "INTLIT", "MINUS", "INTLIT", "EOF"),
                tokensNames(lexerForCode("1 + a * 3 / 4 - 5")))
    }

    @Test
    fun parseMathematicalExpressionWithParenthesis() {
        assertEquals(
                listOf("INTLIT", "PLUS", "LPAREN", "ID", "ASTERISK", "INTLIT", "RPAREN", "MINUS", "DECLIT", "EOF"),
                tokensNames(lexerForCode("1 + (a * 3) - 5.12")))
    }

    @Test
    fun parseCast() {
        assertEquals(
                listOf("ID", "ASSIGN", "ID", "AS", "INT", "EOF"),
                tokensNames(lexerForCode("a = b as Int")))
    }

    @Test
    fun parseSimpleString() {
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode("\"hi!\"")))
    }

    @Test
    fun parseStringWithNewlineEscape() {
        val code = "\"hi!\\n\""
        assertEquals(
                listOf("\"", "hi!", "\\n", "\"", "EOF"),
                tokensContent(lexerForCode(code)))
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "ESCAPE_NEWLINE", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode(code)))
    }

    @Test
    fun parseStringWithSlashEscape() {
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "ESCAPE_SLASH", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode("\"hi!\\\\\"")))
    }

    @Test
    fun parseStringWithDelimiterEscape() {
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "ESCAPE_STRING_DELIMITER", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode("\"hi!\\\"\"")))
    }

    @Test
    fun parseStringWithSharpEscape() {
        assertEquals(
                listOf("STRING_OPEN", "STRING_CONTENT", "ESCAPE_SHARP", "STRING_CLOSE", "EOF"),
                tokensNames(lexerForCode("\"hi!\\#\"")))
    }

    @Test
    fun parseStringWithInterpolation() {
        val code = "\"hi #{name}. This is a number: #{5 * 4}\""
        assertEquals(
                listOf("\"", "hi ", "#{", "name", "}", ". This is a number: ", "#{", "5", "*", "4", "}", "\"", "EOF"),
                tokensContent(lexerForCode(code)))
        assertEquals(
                listOf("STRING_OPEN",
                        "STRING_CONTENT",
                        "INTERPOLATION_OPEN",
                        "ID",
                        "INTERPOLATION_CLOSE",
                        "STRING_CONTENT",
                        "INTERPOLATION_OPEN",
                        "INTLIT",
                        "ASTERISK",
                        "INTLIT",
                        "INTERPOLATION_CLOSE",
                        "STRING_CLOSE",
                        "EOF"
                        ),
                tokensNames(lexerForCode(code))
        )

    }

}