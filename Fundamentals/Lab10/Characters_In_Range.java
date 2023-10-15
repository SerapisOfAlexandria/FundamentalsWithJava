package Fundamentals.Lab10;

import java.util.Scanner;

public class Characters_In_Range {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        getCharactersRange(input);
        }

    public static void getCharactersRange(Scanner input) {
        char firstChar = input.nextLine().charAt(0);
        char secondChar = input.nextLine().charAt(0);

        if ((int) firstChar > (int) secondChar) {
            for (int i = (int) secondChar + 1; i < (int) firstChar; i++) {
                System.out.printf("%c ", (char) i);
            }
        } else if ((int) firstChar < (int) secondChar) {
            for (int i = (int) firstChar + 1; i < (int) secondChar; i++) {
                System.out.printf("%c ", (char) i);
            }
        }
    }
}


