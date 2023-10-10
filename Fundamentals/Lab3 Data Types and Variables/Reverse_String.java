package Fundamentals.Lab3;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1 ; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println(reversedWord);
    }
}
