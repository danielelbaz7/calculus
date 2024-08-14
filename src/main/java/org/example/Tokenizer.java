package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static List<Token> tokenize(String str, Character variable) {
        List<Token> tokens = new ArrayList<Token>();

        str = str.replaceAll(" ", "");
        char[] expressionCharacterArray = str.toCharArray();

        for(int i = 0; i < expressionCharacterArray.length; i++) {

        }

        return tokens;
    }

    private static boolean isDigit(Character ch) {
        return Character.isDigit(ch);
    }

    private static boolean isDecimal(Character ch) {
        return ch == '.';
    }

    private static boolean isVariable(Character ch, Character variable) {
        return ch == variable;
    }

    private static boolean isOperator(Character ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static boolean isLeftParenthesis(Character ch) {
        return ch == '(';
    }

    private static boolean isRightParenthesis(Character ch) {
        return ch == ')';
    }

}
