package Fundamentals.Lab3;

import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] valueList = new int[3];

        for (int i = 0; i < 3; i++) {
            valueList[i] = Integer.parseInt(input.nextLine());
        }

        Arrays.sort(valueList);
        reverse(valueList);

        for (int i = 0; i < 3; i++) {
            System.out.println(valueList[i]);
        }
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
