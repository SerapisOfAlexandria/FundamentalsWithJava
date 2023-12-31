package Fundamentals.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Even_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(input.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        System.out.println(evenSum - (oddSum));
    }
}
