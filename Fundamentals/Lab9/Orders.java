package Fundamentals.Lab9;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String order = input.nextLine();
        int quantity = Integer.parseInt(input.nextLine());

        System.out.printf("%.2f", bill(order, quantity));

    }
    public static double bill(String order, int quantity) {

        double price = 0;

        switch (order) {
            case "coffee":
                price = 1.50 * quantity;
                break;

            case "water":
                price = 1.00 * quantity;
                break;

            case "coke":
                price = 1.40 * quantity;
                break;

            case "snacks":
                price = 2.00 * quantity;
                break;
        }

        return price;
    }
}
