package org.example;

import java.util.Stack;

public class Expression {

    private String expression;
    private char variable;

    public Expression(String e) {
        expression = e;
        variable = 'x';

    }

    public Expression(String e, char var) {
        expression = e;
        variable = var;
    }

    private Stack<Character> shuntingYard() {
        Stack<Character> output = new Stack<>();
        Stack<Character> operator = new Stack<>();

        return output;
    }

    public String toString() {
        return expression;
    }

}
