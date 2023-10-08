package Fundamentals.Lab4;

import java.util.Scanner;

public class Triples_Of_Latin_Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondChar = (char) ('a' + j);
                for (int c = 0; c < n; c++) {
                    char thirdChar = (char) ('a' + c);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }


    }
}
