package Fundamentals.Lab10;

import java.util.Scanner;

public class Top_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printTopNumbers(input.nextInt());
    }

    public static void printTopNumbers(int n) {
        String topNumbers = "";

        for (int i = 1; i <= n; i++) {

            String intToString = String.valueOf(i);
            int sumOfDigits = 0;
            boolean holdsOddDigit = false;

            for (int a = 0; a <= intToString.length() - 1; a++) {
                sumOfDigits += Integer.parseInt(String.valueOf(intToString.charAt(a)));

                if (Integer.parseInt(String.valueOf(intToString.charAt(a))) % 2 != 0) {
                    holdsOddDigit = true;
                }
            }

            if (sumOfDigits % 8 == 0 && holdsOddDigit) {
                topNumbers += intToString + "\n";
            }
        }

        System.out.println(topNumbers);
    }
}
