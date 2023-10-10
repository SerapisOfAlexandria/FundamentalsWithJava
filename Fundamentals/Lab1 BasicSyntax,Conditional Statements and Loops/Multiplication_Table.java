package Fundamentals.Lab1;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), y = input.nextInt();

        if (y < 10) {
            for (int i = y; i <= 10; i++) {
                System.out.printf("%d X %d = %d \n", n, i, n * i);
            }
        } else {
            System.out.printf("%d X %d = %d", n, y, n * y);
        }
    }
}
