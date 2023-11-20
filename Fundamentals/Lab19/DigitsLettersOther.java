package Fundamentals.Lab19;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DigitsLettersOther {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Character> chars = input.nextLine().chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList());

        System.out.println(chars.stream()
                .filter(n -> Character.isDigit(n))
                .map(String::valueOf)
                .collect(Collectors.joining("")));

        System.out.println(chars.stream()
                .filter(n -> Character.isLetter(n))
                .map(String::valueOf)
                .collect(Collectors.joining("")));

        System.out.println(chars.stream()
                .filter(n -> !Character.isLetterOrDigit(n))
                .map(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
