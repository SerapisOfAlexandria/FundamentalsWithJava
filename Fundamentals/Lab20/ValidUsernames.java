package Fundamentals.Lab20;

import java.util.Arrays;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = input.nextLine().split(", ");

        Arrays.stream(names).filter(name -> isValidName(name)).forEach(System.out::println);
    }

    public static boolean isValidName(String name)  {
        char[] symbols = name.toCharArray();

        for (int i = 0; i <= symbols.length - 1; i++) {
            if (symbols.length < 3 || symbols.length > 16) {
                return false;
            }

            if (Character.isLetter(symbols[i]) || Character.isDigit(symbols[i]) || symbols[i] == '-' || symbols[i] == '_') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
