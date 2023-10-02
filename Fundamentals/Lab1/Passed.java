package Fundamentals.Lab1;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = Double.parseDouble(input.nextLine());

        if (x < 3.00) {

        } else {
            System.out.printf("Passed!");
        }

    }
}
