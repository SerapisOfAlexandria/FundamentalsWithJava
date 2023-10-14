package Fundamentals.Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_Operation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber = Double.parseDouble(input.nextLine());
        String operator = input.nextLine();
        double secondNumber = Double.parseDouble(input.nextLine());

        double result = calculateResult(firstNumber, operator, secondNumber);
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    public static double calculateResult(double x, String operator, double y) {
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "/":
                if (x == 0 || y == 0) {
                    return 0;
                } else {
                    return x / y;
                }
            case "*":
                return x * y;
        }
        return 0;
    }
}
