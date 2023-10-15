package Fundamentals.Lab10;

import java.util.Scanner;

public class Middle_Characters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String string = input.nextLine();
        printMiddleCharacters(string);

    }

    public static void printMiddleCharacters(String string) {
        if (string.length() % 2 == 0) {
            System.out.printf("%s%s", String.valueOf(string.charAt((string.length() - 1) / 2)), String.valueOf(string.charAt((string.length() / 2))));
        } else {
            System.out.printf("%s", String.valueOf(string.charAt((string.length() - 1) / 2)));
        }
    }
}
