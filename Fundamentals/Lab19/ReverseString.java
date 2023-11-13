package Lab19;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] string = input.nextLine().toCharArray();

        for (int i = 0; i <= (string.length - 1) / 2; i++) {
            char temp = string[i];
            string[i] = string[string.length - (i + 1)];
            string[string.length - (i + 1)] = temp;
        }

        String reversedString = new String(string);

        System.out.println(reversedString);
    }
}
