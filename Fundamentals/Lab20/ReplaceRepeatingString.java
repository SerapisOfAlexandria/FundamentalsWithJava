package Fundamentals.Lab20;

import java.util.*;
import java.util.stream.Collectors;

public class ReplaceRepeatingString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[] word = input.nextLine().toCharArray();
        StringBuilder filteredWord = new StringBuilder("");
        char lastChar = '.';

        for (int i = 0; i <= word.length - 1; i++) {
            if (word[i] == lastChar) {
                continue;
            } else {
                filteredWord.insert(0, word[i]);
                lastChar = word[i];
            }
        }


        System.out.println(filteredWord.reverse());
    }
}