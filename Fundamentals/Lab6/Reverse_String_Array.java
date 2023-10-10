package Fundamentals.Lab6;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse_String_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] strings = Arrays.stream(input.nextLine().split(" "))
                .toArray(String[]::new);

        for (int i = 0; i < strings.length / 2; i++) {

            String temp = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = strings[i];
            strings[i] = temp;

        }

        for (int i = 0; i <= strings.length - 1; i++) {
            System.out.printf("%s ",strings[i]);
        }
    }
}
