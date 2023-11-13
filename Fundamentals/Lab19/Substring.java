package Fundamentals.Lab19;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String filterWord = input.nextLine();
        String string = input.nextLine();

        while (string.indexOf(filterWord) != -1) {
            string = string.replace(filterWord, "");
        }

        System.out.println(string);
    }
}
