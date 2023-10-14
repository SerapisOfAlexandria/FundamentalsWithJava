package Fundamentals.Lab9;

import java.util.Scanner;

public class Repeat_String {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(repeat(input.nextLine(), Integer.parseInt(input.nextLine())));
    }

    public static String repeat(String string, int repeat) {
        String repeatedString = "";

        for (int i = 0; i < repeat; i++) {
            repeatedString += string;
        }

        return repeatedString;
    }
}
