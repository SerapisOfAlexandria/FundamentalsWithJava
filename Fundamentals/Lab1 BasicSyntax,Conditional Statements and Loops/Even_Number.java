package Fundamentals.Lab1;

import java.util.Scanner;

public class Even_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = input.nextInt();
        }

        System.out.printf("The number is: %d", Math.abs(n));

    }
}
