package Fundamentals.Lab8;

import java.util.Scanner;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] inputInts = input.nextLine().split(" ");
        int[] ints = new int[inputInts.length];
        for (int i = 0; i <= inputInts.length - 1; i++) {
            ints[i] = Integer.parseInt(inputInts[i]);
        }

        String subsequences = "";

        if (ints.length == 1) {
            System.out.println(ints[0]);
            return;
        }

        for (int i = 0; i <= ints.length - 1 ; i++) {
            if (ints[i] <= ints[i + 1]) {
                subsequences += Integer.toString(ints[i]) + " ";
            } else {
                continue;
            }
        }

        System.out.println(subsequences);
    }
}
