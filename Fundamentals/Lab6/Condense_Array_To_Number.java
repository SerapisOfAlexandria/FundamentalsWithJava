package Fundamentals.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_To_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArrOne = Arrays
                .stream(input.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        System.out.println(condensedArr(numbersArrOne));

    }

    public static int condensedArr(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        } else {
            int[] newArr = new int[arr.length - 1];

            for (int i = 0; i <= newArr.length - 1; i++) {
                newArr[i] = arr[i] + arr[i+1];
            }

            return condensedArr(newArr);
        }
    }
}
