package Fundamentals.Lab10;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printNxnMatrix(input.nextInt());
    }

    public static void printNxnMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                System.out.printf("%d ", n);
            }
            System.out.println("");
        }
    }
}
