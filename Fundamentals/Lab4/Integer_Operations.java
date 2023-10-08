package Fundamentals.Lab4;

import java.util.Scanner;

public class Integer_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());
        int numFour = Integer.parseInt(sc.nextLine());

        System.out.println(((numOne + numTwo) / numThree) * numFour);
    }
}
