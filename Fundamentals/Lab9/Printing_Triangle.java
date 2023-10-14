package Fundamentals.Lab9;

import java.util.Scanner;

public class Printing_Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        printTriangleAscending(n);
        printTriangleDescending(n - 1);

    }

    public static void printTriangleAscending(int n) {
        for (int i = 1; i <= n; i++) {
           for (int b = 1; b <= i; b++) {
               System.out.printf("%d ", b);
           }
            System.out.printf("\n");
        }
    }

    public static void printTriangleDescending(int n) {
        for (int i = n; i >= 1; i--) {
            for (int b = 1; b <= i; b++) {
                System.out.printf("%d ", b);
            }
            System.out.printf("\n");
        }
    }
}
