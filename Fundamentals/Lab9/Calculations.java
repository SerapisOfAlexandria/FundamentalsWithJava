package Fundamentals.Lab9;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String operation = input.nextLine();

        int x = Integer.parseInt(input.nextLine()), y = Integer.parseInt(input.nextLine());

        switch(operation) {
            case "subtract":
                System.out.println(subtract(x, y));
                break;

            case "multiply":
                System.out.println(multiply(x, y));
                break;

            case "divide":
                System.out.println(divide(x, y));
                break;

            case "add":
                System.out.println(add(x, y));
                break;
        }
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) {
            return 0;
        }

        return dividend / divisor;
    }

    public static int add(int addendOne, int addendTwo) {
        return addendOne + addendTwo;
    }

    public static int multiply(int multiplicand, int multiplier) {
        if (multiplicand == 0 || multiplier == 0) {
            return 0;
        }
        return multiplicand * multiplier;
    }

    public static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}
