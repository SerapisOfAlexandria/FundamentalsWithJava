package Fundamentals.Lab13;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0;
        double totalPriceTaxed = 0;
        String partPrice = input.nextLine();
        String typeOfClient = "";

        while (true) {

            if (partPrice.equals("special") || partPrice.equals("regular")) {
                typeOfClient = partPrice;
                break;
            } else if (Double.parseDouble(partPrice) < 0) {
                System.out.println("Invalid price!");
                partPrice = input.nextLine();
            } else {
                totalPrice += Double.parseDouble(partPrice);
                partPrice = input.nextLine();
            }
        }

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else if (typeOfClient.equals("special")) {
            totalPriceTaxed = totalPrice * 1.2 * 0.9;
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                            "Price without taxes: %.2f$%n" +
                            "Taxes: %.2f$%n" +
                            "-----------%n" +
                            "Total price: %.2f$", totalPrice, (totalPrice * 1.2) - totalPrice, totalPriceTaxed );
        } else {
            totalPriceTaxed = totalPrice * 1.2;
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$", totalPrice, totalPriceTaxed - totalPrice, totalPriceTaxed );
        }
    }
}
