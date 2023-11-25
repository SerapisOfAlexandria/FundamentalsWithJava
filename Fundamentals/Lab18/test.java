package Fundamentals.Lab18;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] operationCodes = input.nextLine()
                .replaceAll(" ", " ")
                .split(" ");

        System.out.println(Arrays.toString(operationCodes));
    }
}