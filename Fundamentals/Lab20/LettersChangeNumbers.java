package Fundamentals.Lab20;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] operationCodes = input.nextLine().split("\\s+");
        double sum = 0;

        for (int i = 0; i <= operationCodes.length - 1; i++) {
            double number = Double.parseDouble(operationCodes[i].substring(1, operationCodes[i].length() - 1));
            char[] letters = new char[2];
            letters[0] = operationCodes[i].charAt(0);
            letters[1] = operationCodes[i].charAt(operationCodes[i].length() - 1);

            if (letters[0] >= 97 && letters[0] <= 122) {
                number *= letters[0] - 96;
            } else {
                number /= Character.toLowerCase(letters[0]) - 96;
            }

            if (letters[1] >= 97 && letters[1] <= 122) {
                number += letters[1] - 96;
            } else {
                number -= Character.toLowerCase(letters[1]) - 96;
            }

            sum += number;
        }

        System.out.printf("%.2f", sum);
    }
}