package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    public static List<Token> tokenize(String str) {
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

}
