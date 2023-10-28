package Fundamentals.Lab15;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(bigFactorial(Integer.parseInt(input.nextLine())));
    }

    public static BigInteger bigFactorial(int a) {
        BigInteger b = new BigInteger(Integer.toString(a));
        if (a == 1) {
            return BigInteger.valueOf(1);
        } else {
            return b.multiply(bigFactorial(a - 1));
        }
    }
}
