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
            boolean buildingANumber = false;
            StringBuilder tokenValue = new StringBuilder();

            if(isDigit(ch)) {
                buildingANumber = true;
                tokenValue.append(ch);
            } else if(isSign(ch) &&
                    (i == 0 || isLeftParenthesis(charArr[i - 1]) || !isOperator(charArr[i - 1]))) {
                buildingANumber = true;
                tokenValue.append(ch);
            } else if(isDecimal(ch)) {
                buildingANumber = true;
                tokenValue.append(0);
                tokenValue.append(ch);
            }

            //if it is a digit, decimal, or pos/neg sign, start building a number
            if(buildingANumber) {
                //build the number
                while(isDigit(charArr[i + 1]) || isDecimal(charArr[i + 1])) {
                    System.out.println(charArr[i + 1]);
                    tokenValue.append(charArr[i + 1]);
                    i++;
                }
                tokens.add(new Token(Token.NUMBER, tokenValue.toString()));
            }

            else if(isLetter(ch)) {

            }

            else if(isOperator(ch)) {
                tokens.add(new Token(Token.OPERATOR, String.valueOf(ch)));
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

    private static boolean isLetter(Character ch) {
        return Character.isLetter(ch);
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
