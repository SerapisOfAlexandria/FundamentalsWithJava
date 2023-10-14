package Fundamentals.Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();
        int power = input.nextInt();

        System.out.println(new DecimalFormat("0.####").format(mathPow(n, power)));
    }

    public static double mathPow(double x, int y) {
        if (y == 1) {
            return x;
        }

        return x  * mathPow(x, y - 1);
    }
}
