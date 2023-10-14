package Fundamentals.Lab9;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        grade(input.nextDouble());
    }

    public static void grade(double n) {
        if (n <= 2.99) {
            System.out.printf("Fail");
        } else if (n <= 3.49) {
            System.out.printf("Poor");
        } else if (n <= 4.49) {
            System.out.printf("Good");
        } else if (n <= 5.49) {
            System.out.printf("Very good");
        } else {
            System.out.printf("Excellent");
        }
    }
}
