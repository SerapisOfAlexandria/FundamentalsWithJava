package Fundamentals.Lab15;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        sentenceRandomizer(input);

    }

    public static void sentenceRandomizer(Scanner input) {
        List<String> sentence = Arrays.stream(input.nextLine().split(" "))
                .map(String::valueOf)
                .collect(Collectors.toList());

        int sentenceLength = sentence.size();
        Random random = new Random();

        for (int i = 0; i <= sentenceLength - 1; i++) {
            if (sentence.size() - 1 == 0) {
                System.out.println(sentence.get(0));
            } else {
                int randomNumber = random.nextInt(sentence.size() - 1);
                System.out.println(sentence.get(randomNumber));
                sentence.remove(randomNumber);
            }
        }
    }
}
