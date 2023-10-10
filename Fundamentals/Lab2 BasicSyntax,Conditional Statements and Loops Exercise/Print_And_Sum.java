package Fundamentals.Lab2;

import java.util.Scanner;

public class Print_And_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startingPoint = input.nextInt();
        int endingPoint = input.nextInt();
        int sum = 0;

        for (int i = startingPoint; i <= endingPoint; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }

        System.out.println("\nSum: " + sum);

    }
}
