package Fundamentals.Lab19;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, String> stringEntries = new LinkedHashMap<>();
        String string = input.nextLine();
        char[] word = string.toCharArray();


        while (!String.valueOf(word).equals("end")) {
            for (int i = 0; i <= (word.length - 1) / 2; i++) {
                char temp = word[i];
                word[i] = word[word.length - (i + 1)];
                word[word.length - (i + 1)] = temp;
            }
            String reversedString = new String(word);
            stringEntries.put(string, reversedString);

            string = input.nextLine();
            word = string.toCharArray();
        }

        stringEntries.entrySet().stream()
                .map(stringEntry -> stringEntry.getKey() + " = " + stringEntry.getValue())
                .forEach(System.out::println);
    }
}
