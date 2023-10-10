package Fundamentals.Lab3;

import java.io.*;

public class Messages {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iterations = Integer.parseInt(br.readLine().trim());

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < iterations; i++) {

            String input = br.readLine().trim();

            if (!input.isEmpty()) {
                if (input.charAt(0) == '0') {
                    word.append(" ");
                } else {
                    char result = keypadToChar(input);
                    word.append(result);
                }
            }
        }

        System.out.println(word);
    }

    private static char keypadToChar(String input) {

        int length = input.length();

        int mainDigit = input.charAt(0) - '0';

        int offset = (mainDigit - 2) * 3;
        if (mainDigit == 8 || mainDigit == 9) {
            offset += 1;
        }


        int letterIndex = offset + length - 1;

        return (char) ('a' + letterIndex);
    }
}