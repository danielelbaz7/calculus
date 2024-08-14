package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        InputProcessor ip = new InputProcessor();
        //ip.run();

        System.out.println(Tokenizer.tokenize("-123456789 s789s", 'x').get(0).value);

        String s = "a a a a";
        Tokenizer.tokenize(s, 'x')
;
    }
}