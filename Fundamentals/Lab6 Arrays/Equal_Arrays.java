package Fundamentals.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArrOne = Arrays
                .stream(input.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int[] numbersArrTwo = Arrays
                .stream(input.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sumArrOne = 0;
        int sumArrTwo = 0;
        int count = 0;

        for (int i = 0; i <= numbersArrOne.length - 1; i++) {
            if (numbersArrTwo[i] == numbersArrOne[i]) {
                count++;
            } else {
                break;
            }
        }

        if (count == numbersArrOne.length) {

            for (int i = 0; i <= numbersArrOne.length - 1; i++) {
                sumArrOne += numbersArrOne[i];
            }

            for (int i = 0; i <= numbersArrTwo.length - 1; i++) {
                sumArrTwo += numbersArrTwo[i];
            }

            System.out.printf("Arrays are identical. Sum: %d", sumArrOne);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", count);
        }
    }
}
