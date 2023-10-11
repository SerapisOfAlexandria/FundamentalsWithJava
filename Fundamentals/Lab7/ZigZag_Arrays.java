package Fundamentals.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];
        int count = 0;

        for (int i = 0; i <= n - 1; i++) {
            int numOne = input.nextInt();
            int numTwo  = input.nextInt();

            if (count % 2 == 0) {
                arrOne[i] = numOne;
            } else {
                arrOne[i] = numTwo;
            }

            if (count % 2 == 0) {
                arrTwo[i] = numTwo;
            } else {
                arrTwo[i] = numOne;
            }

            count++;
        }

        System.out.println(Arrays.toString(arrOne).replace(", ", " ").replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(arrTwo).replace(", ", " ").replace("[", "").replace("]", ""));

    }
}
