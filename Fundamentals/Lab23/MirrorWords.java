package Fundamentals.Lab23;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MirrorWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        ArrayList<String[]> mirrorWords = new ArrayList<>();
        ArrayList<String> validPairs = new ArrayList<>();
        int validPairsCount = 0;

        Pattern pattern = Pattern.compile("([#@])(?<wordOne>[A-Za-z]{3,})\\1{2}(?<wordTwo>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");

            if (wordOne.equals(reverseString(wordTwo))) {
                mirrorWords.add(new String[]{wordOne, wordTwo});
                validPairsCount++;
                continue;
            }

            validPairsCount++;
        }

        if (validPairsCount == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!\n", validPairsCount);
            if (mirrorWords.size() == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(mirrorWords.stream().map(entry -> entry[0] + " <=> " + entry[1]).collect(Collectors.joining(", ")));
            }
        }
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
