package Fundamentals.Lab2;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int orders = Integer.parseInt(input.nextLine());
        double sum = 0;
        double currentSum = 0;

        for (int i = 0; i < orders; i++) {
            currentSum = Double.parseDouble(input.nextLine()) * (Double.parseDouble(input.nextLine()) * Double.parseDouble(input.nextLine()));
            sum += currentSum;
            System.out.printf("The price for the coffee is: $%.2f\n", currentSum);
        }
        System.out.printf("Total: $%.2f", sum);
    }
}
