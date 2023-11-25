package Fundamentals.Lab23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder secretText = new StringBuilder(input.nextLine());
        String[] command = input.nextLine().split(":\\|:");

        while (!command[0].equals("Reveal")) {
            switch (command[0]) {
                case "InsertSpace":
                    secretText.insert(Integer.parseInt(command[1]), " ");
                    System.out.println(secretText);
                    break;
                case "Reverse":
                    int stringLocation = secretText.indexOf(command[1]);
                    if(stringLocation != -1) {
                        String substring = secretText.substring(stringLocation, stringLocation + command[1].length());
                        secretText.replace(stringLocation, stringLocation + command[1].length(), "");
                        secretText.append(reverseString(substring));
                        System.out.println(secretText);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    int indexOfString = secretText.indexOf(command[1]);
                    String replacementString = command[2];
                    while (indexOfString != -1) {
                        secretText.replace(indexOfString, indexOfString + command[1].length(), replacementString);
                        indexOfString = secretText.indexOf(command[1]);
                    }
                    System.out.println(secretText);
                    break;
            }


            command = input.nextLine().split(":\\|:");
        }

        System.out.printf("You have a new text message: %s", secretText);
    }

    public static String reverseString(String string) {
        char[] letters = string.toCharArray();

        for (int i = 0; i < letters.length / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[(letters.length - 1) - i];
            letters[(letters.length - 1) - i] = temp;
        }

        return String.valueOf(letters);
    }
}
