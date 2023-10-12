package Fundamentals.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputArr = input.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i <= inputArr.length - 1; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        int rotations = Integer.parseInt(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            rotation(numbersArr);
        }

        System.out.println(Arrays.toString(numbersArr).replace(", ", " ").replace("[", "").replace("]", ""));
    }

    public static int[] rotation(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {

            if (i == arr.length - 1) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i + 1];
            }
        }

        return arr;
    }

}
