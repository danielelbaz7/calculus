package org.example;

import java.util.Scanner;

public class InputProcessor {

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to find?");
        System.out.println("Derivative or integral?");
        String searchingFor = switch (input.nextLine().substring(0, 1)) {
            case "d", "D" -> "derivative";
            case "i", "I" -> "integral";
            default -> "";
        };

        while(!searchingFor.equalsIgnoreCase("derivative") && !searchingFor.equalsIgnoreCase("integral")) {
            System.out.println("Please type either \"derivative\" or \"integral\".");
            searchingFor = switch (input.nextLine().substring(0, 1)) {
                case "d", "D" -> "derivative";
                case "i", "I" -> "integral";
                default -> "";
            };
        }
        System.out.println("You have chosen " + searchingFor + ".");

    }

}
