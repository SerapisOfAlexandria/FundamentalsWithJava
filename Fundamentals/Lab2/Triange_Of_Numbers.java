package Fundamentals.Lab2;

import java.util.Scanner;

public class Triange_Of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int b = i; b > 0; b--) {
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }
    }
}
