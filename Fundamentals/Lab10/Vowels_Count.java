package Fundamentals.Lab10;

import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        countVowels(word);
    }

    public static void countVowels(String word) {
        String vowels = "AEOIUaeoiu";
        int vowelSum = 0;

        for (int i = 0; i <= word.length() - 1; i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                vowelSum++;
            }
        }

        System.out.println(vowelSum);
    }
}
