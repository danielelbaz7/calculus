package org.example;

public class Token {

    public static final int NUMBER = 0;
    public static final int OPERATOR = 1;
    public static final int VARIABLE = 2;
    public static final int FUNCTION = 3;
    public static final int RIGHT_PARENTHESIS = 4;
    public static final int LEFT_PARENTHESIS = 5;
    public static final int UNKNOWN = 6;

    int type;
    String value;

    public Token(int type, String value) {
        this.type = type;
        this.value = value;
    }

}
