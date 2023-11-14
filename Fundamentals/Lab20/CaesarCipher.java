package Fundamentals.Lab20;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String encryptedText = input.nextLine().chars()
                .mapToObj(c -> (char) (c + 3))
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        System.out.println(encryptedText);
    }
}
