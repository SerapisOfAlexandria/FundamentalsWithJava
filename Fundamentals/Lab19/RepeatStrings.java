package Fundamentals.Lab19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = input.nextLine().split(" ");
        ArrayList<String> repeatedWords = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                repeatedWords.add(word);
            }
        }

        System.out.println(repeatedWords.stream().map(entry -> entry + "").collect(Collectors.joining("")));
    }
}
