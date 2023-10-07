package Fundamentals.Lab3;

import java.util.Scanner;

public class English_Name_Of_The_Last_Digit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        lastDigitInWords(num);
    }

    public static void lastDigitInWords(String number) {
        int wordLength = number.length() - 1;
        if (Character.getNumericValue(number.charAt(wordLength)) == 0) {
            System.out.println("zero");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 1) {
            System.out.println("one");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 2) {
            System.out.println("two");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 3) {
            System.out.println("three");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 4) {
            System.out.println("four");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 5) {
            System.out.println("five");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 6) {
            System.out.println("six");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 7) {
            System.out.println("seven");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 8) {
            System.out.println("eight");
        } else if (Character.getNumericValue(number.charAt(wordLength)) == 9) {
            System.out.println("nine");
        }
    }
}
