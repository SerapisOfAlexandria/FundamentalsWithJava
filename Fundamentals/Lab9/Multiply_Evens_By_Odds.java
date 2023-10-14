package Fundamentals.Lab9;

import java.util.Scanner;

public class Multiply_Evens_By_Odds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(multiplyEvensByOdds(input.nextLine()));

    }

    public static int multiplyEvensByOdds(String n) {

        int oddSum = 0, evenSum = 0;

        if (n.charAt(0) == '-') {
            for (int i = 1; i <= n.length() - 1; i++) {
                if (Character.getNumericValue(n.charAt(i)) % 2 == 0) {
                    evenSum += Character.getNumericValue(n.charAt(i));
                } else {
                    oddSum += Character.getNumericValue(n.charAt(i));
                }
            }
        } else {
            for (int i = 0; i <= n.length() - 1; i++) {
                if (Character.getNumericValue(n.charAt(i)) % 2 == 0) {
                    evenSum += Character.getNumericValue(n.charAt(i));
                } else {
                    oddSum += Character.getNumericValue(n.charAt(i));
                }
            }
        }

        return oddSum * evenSum;
    }
}
