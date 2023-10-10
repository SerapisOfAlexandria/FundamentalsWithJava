package Fundamentals.Lab1;

import java.util.Scanner;

public class Sum_Odd_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  =  1;
        int sum = 0;

        for (int i = input.nextInt(); i > 0; i--) {
            sum += n;
            System.out.println(n);
            n += 2;
        }

        System.out.printf("Sum: %d", sum);

    }
}
