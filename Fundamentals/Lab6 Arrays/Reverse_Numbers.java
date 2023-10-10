package Fundamentals.Lab6;

import java.util.Scanner;

public class Reverse_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[Integer.parseInt(input.nextLine())];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }

    }
}
