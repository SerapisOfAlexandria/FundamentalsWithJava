package Fundamentals.Lab2;

import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        String change = input.nextLine();

        while (!change.equals("Start")) {
            if
            (Double.parseDouble(change) == 0.1 || Double.parseDouble(change) == 0.2 || Double.parseDouble(change) == 0.5 || Double.parseDouble(change) == 1.0 ||
             Double.parseDouble(change) == 2.0) {
                sum += Double.parseDouble(change);
            } else {
                System.out.printf("Cannot accept %.2f\n", Double.parseDouble(change));
            }

            change = input.nextLine();
        }

        change = input.nextLine();
        while (!change.equals("End")) {
            if (change.equals("Nuts") || change.equals("Water") || change.equals("Soda") || change.equals("Coke") || change.equals("Crisps")) {
                if (change.equals("Nuts") && sum >= 2.0) {
                    System.out.println("Purchased Nuts");
                    sum -= 2.0;
                } else if (change.equals("Water") && sum >= 0.7) {
                    System.out.println("Purchased Water");
                    sum -= 0.7;
                } else if (change.equals("Crisps") && sum >= 1.5) {
                    System.out.println("Purchased Crisps");
                    sum -= 1.5;
                } else if (change.equals("Soda") && sum >= 0.8) {
                    System.out.println("Purchased Soda");
                    sum -= 0.8;
                } else if (change.equals("Coke") && sum >= 1.0) {
                    System.out.println("Purchased Coke");
                    sum -= 1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            change = input.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
