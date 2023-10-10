package Fundamentals.Lab2;

import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number = input.nextLine();
        int sum = 0;

        for (int i = 0; i <= number.length() - 1; i++) {
            sum += factorial(Character.getNumericValue(number.charAt(i)));
        }

        if (sum == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * (factorial(n-1));
        }
    }
}
