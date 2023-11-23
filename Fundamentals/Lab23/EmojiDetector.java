package Lab23;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String regexEmojis = "(\\*{2}|\\:{2})(?<emojiName>[A-Z][a-z]{2,})\\1";
        Pattern patternEmojis = Pattern.compile(regexEmojis);
        Matcher matcherEmojis = patternEmojis.matcher(text);

        LinkedHashMap<String, Integer> validEmojiValues = new LinkedHashMap<>();

        long coolThreshold = Arrays.stream(text.split("\\d+"))
                .mapToLong(entry -> Long.parseLong(entry)).

        while (matcherEmojis.find()) {
            int emojiValue = matcherEmojis.group("emojiName").chars().sum();
            if(emojiValue)
            emojiValues.put(matcherEmojis.group("emojiName"), emojiValue);
        }
        ArrayList<String> coolEmojis = new ArrayList<>();

        BigInteger coolnessThreshold = new BigInteger("0");

    }
}
