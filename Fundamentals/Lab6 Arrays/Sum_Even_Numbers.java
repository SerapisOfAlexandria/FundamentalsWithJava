package Fundamentals.Lab6;

import java.util.Scanner;
import java.util.Arrays;

public class Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(input.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
