package Fundamentals.Lab3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Gaming_Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = Double.parseDouble(input.nextLine());
        double initialBalance = balance;

        Map<String, Double> games = new HashMap<>();
        games.put("OutFall 4", 39.99);
        games.put("CS: OG", 15.99);
        games.put("Zplinter Zell", 19.99);
        games.put("Honored 2", 59.99);
        games.put("RoverWatch", 29.99);
        games.put("RoverWatch Origins Edition", 39.99);

        while (true) {
            String game = input.nextLine();
            if ("Game Time".equals(game)) {
                break;
            }

            if(games.containsKey(game)) {
                if (balance >= games.get(game)) {
                    balance -= games.get(game);
                    System.out.printf("Bought %s%n", game);
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }
        }

        double totalSpent = initialBalance - balance;
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalSpent, balance);
    }
}
