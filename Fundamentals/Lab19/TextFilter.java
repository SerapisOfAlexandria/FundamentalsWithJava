package Fundamentals.Lab19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] hiddenWords = input.nextLine().split(", ");
        String text = input.nextLine();

        for (int i = 0; i <= hiddenWords.length - 1; i++) {
            String asterixSymbols = "*".repeat(hiddenWords[i].length());
            text = text.replace(hiddenWords[i], asterixSymbols);
        }

        System.out.println(text);
    }
}
