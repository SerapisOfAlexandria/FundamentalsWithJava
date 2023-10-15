package Fundamentals.Lab10;

import java.util.Scanner;

public class Factorial_Division {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("%.2f", (double) factorial(Integer.parseInt(input.nextLine())) / factorial(Integer.parseInt(input.nextLine())));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return n * factorial(n - 1);
    }
}
