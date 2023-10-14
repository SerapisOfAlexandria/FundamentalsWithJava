package Fundamentals.Lab8;

import java.util.Scanner;

public class Recursive_Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
