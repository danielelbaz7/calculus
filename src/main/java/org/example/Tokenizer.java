package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static List<Token> tokenize(String str, Character variable) {
        List<Token> tokens = new ArrayList<Token>();

        str = str.replaceAll(" ", "");
        char[] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];

            if(isDigit(ch) || isDecimal(ch) || isSign(ch)) {
                StringBuilder number = new StringBuilder(String.valueOf(ch));

                if(i != 0 && !isLeftParenthesis(charArr[i - 1]) && !isOperator(charArr[i - 1])) {
                    tokens.add(new Token(Token.OPERATOR, String.valueOf(ch)));
                }
                else {
                    while(isDigit(charArr[i + 1]) || isDecimal(charArr[i + 1])) {
                        number.append(charArr[i + 1]);
                        i++;
                    }
                }
            }
        }

        return tokens;
    }

    //helper methods, used in tokenizer to organize each character
    private static boolean isDigit(Character ch) {
        return Character.isDigit(ch);
    }

    private static boolean isDecimal(Character ch) {
        return ch == '.';
    }

    private static boolean isSign(Character ch) {
        return ch == '+' || ch == '-';
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
