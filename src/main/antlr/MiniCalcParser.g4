parser grammar MiniCalcParser;

// We specify which lexer we are using: so it knows
// which terminals we can use
options { tokenVocab=MiniCalcLexer; }

miniCalcFile : lines=line+ ;

line : statement (NEWLINE | EOF) ;

statement   : inputDeclaration  # inputDeclarationStatement
            | varDeclaration    # varDeclarationStatement
            | assignment        # assignmentStatement
            | print             # printStatement ;

print : PRINT LPAREN expression RPAREN ;

inputDeclaration : INPUT type name=ID ;

varDeclaration : VAR assignment ;

assignment : ID ASSIGN expression ;

expression  : left=expression operator=(DIVISION|ASTERISK) right=expression
            | left=expression operator=(PLUS|MINUS) right=expression
            | value=expression AS targetType=type
            | LPAREN expression RPAREN
            | ID
            | MINUS expression
            | STRING_OPEN (parts+=stringLiteralContent)* STRING_CLOSE
            | INTLIT
            | DECLIT ;

stringLiteralContent    : STRING_CONTENT
                        | INTERPOLATION_OPEN expression INTERPOLATION_CLOSE ;

type    : INT
        | DECIMAL
        | STRING ;

