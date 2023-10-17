package Fundamentals.Lab11;

import java.util.Scanner;

public class PthBit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String binaryRepresentation = Integer.toBinaryString(input.nextInt());
        int positionP = input.nextInt();

        System.out.println(String.valueOf(binaryRepresentation.charAt(positionP)));
    }
}
