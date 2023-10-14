package Fundamentals.Lab9;

import java.util.Scanner;

public class Sign_Of_Integer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        signOfInteger(input.nextInt());

    }

    public static void signOfInteger(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else {
            System.out.printf("The number 0 is zero.");
        }
    }
}
