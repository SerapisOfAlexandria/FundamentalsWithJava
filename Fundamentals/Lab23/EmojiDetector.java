package Fundamentals.Lab23;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmojiDetector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Input text
        String text = input.nextLine();
        // Regex mappings and patterns
        String regexEmojis = "(\\*{2}|\\:{2})(?<emojiName>[A-Z][a-z]{2,})\\1";
        Pattern patternEmojis = Pattern.compile(regexEmojis);
        Matcher matcherEmojis = patternEmojis.matcher(text);
        Pattern patternValues = Pattern.compile("\\d");
        Matcher matcherValues = patternValues.matcher(text);

        // A list for all valid values, number counter for all valid emojis, and a threshold calculator
        ArrayList<String> validEmojiValues = new ArrayList<>();
        int emojiCount = 0;
        long coolThreshold = matcherValues.results()
                .mapToLong(entry -> Long.parseLong(entry.group()))
                .reduce(1L, (a, b) -> a * b);

        while (matcherEmojis.find()) {
            emojiCount++;
            int emojiValue = matcherEmojis.group("emojiName").chars().sum();
            if(emojiValue >= coolThreshold) {
                validEmojiValues.add(matcherEmojis.group(0));
            }
        }

        System.out.printf("Cool threshold: %d\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", emojiCount);
        validEmojiValues.stream().forEach(System.out::println);
    }
}
