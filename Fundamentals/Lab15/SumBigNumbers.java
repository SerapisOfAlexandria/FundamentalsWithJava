package Fundamentals.Lab15;

import java.util.Scanner;
import java.math.BigInteger;

public class SumBigNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = new BigInteger(input.nextLine());
        sumBigNumbers(a, b);
    }

    public static void sumBigNumbers(BigInteger a, BigInteger b) {
        System.out.println(a.add(b));
    }
}
