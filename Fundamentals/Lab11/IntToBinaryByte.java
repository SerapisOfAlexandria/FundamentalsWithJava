package Fundamentals.Lab11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IntToBinaryByte {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] binaryValues = {1, 2, 4, 8, 16, 32, 64, 128};
        int number = input.nextInt();
        int[] bits = {0, 0, 0, 0, 0, 0, 0, 0};

        while (number != 0) {
            for (int a = 0; a <= binaryValues.length - 1; a++) {
                if (binaryValues[a] > number && a != 0) {
                    number -= binaryValues[a - 1];
                    bits[a - 1] = 1;
                    break;
                } else if (binaryValues[a] == number) {
                    number -= binaryValues[a];
                    bits[a] = 1;
                    break;
                }
            }
        }

        reverseArray(bits);
        int[] finishedBits = removeUnnecessaryZeros(bits);
        System.out.println(Arrays.toString(finishedBits).replace(", ", " ").replace("[", "").replace("]", ""));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] removeUnnecessaryZeros(int[] bits) {
        int lengthOfNewArray = 0;
        int bitsToCut = 0;
        for (int i = 0; i <= bits.length - 1; i++) {
            if (bits[i] == 1) {
                lengthOfNewArray =  8 - i ;
                bitsToCut = i;
                break;
            }
        }

        int[] newArr = new int[lengthOfNewArray];
        for (int i = 0; i <= newArr.length - 1; i++) {
            newArr[i] = bits[i + bitsToCut];
        }

        return newArr;
    }
}
