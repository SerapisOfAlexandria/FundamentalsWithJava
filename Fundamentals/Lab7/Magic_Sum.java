package Fundamentals.Lab7;

import java.util.Scanner;

public class Magic_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = input.nextLine().split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i <= intArr.length - 1; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        int magicNumber = Integer.parseInt(input.nextLine());

        String magicPairs = "";

        for (int i = 0; i <= intArr.length - 1; i++) {
            for (int c = i + 1; c <= intArr.length - 1; c++) {
                if (intArr[i] + intArr[c] == magicNumber) {
                    magicPairs += "" + intArr[i] + " " + intArr[c] + "\n";
                }
            }
        }

        System.out.println(magicPairs);
    }
}
