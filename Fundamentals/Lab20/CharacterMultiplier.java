package Fundamentals.Lab20;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(charMultiplier(input.nextLine().split(" ")));
    }

    public static int charMultiplier(String[] string) {
        char[] wordOne = string[0].toCharArray();
        char[] wordTwo = string[1].toCharArray();
        int sum = 0;

        for (int i = 0; i <= Math.min(wordOne.length - 1, wordTwo.length - 1); i++) {
            sum += (int) wordOne[i] * (int) wordTwo[i];
        }

        if (wordOne.length - 1 < wordTwo.length - 1) {
            for (int i = wordOne.length; i <= wordTwo.length - 1; i++) {
                sum += (int) wordTwo[i];
            }
        } else {
            for (int i = wordTwo.length; i <= wordOne.length - 1; i++) {
                sum += (int) wordOne[i];
            }
        }

        return sum;
    }
}
