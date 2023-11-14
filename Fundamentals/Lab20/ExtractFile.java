package Fundamentals.Lab20;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] filePath = input.nextLine().split("\\\\");
        String[] file = filePath[filePath.length - 1].split("\\.");

        System.out.printf("File name: %s%n" +
                "File extension: %s", file[0], file[1]);
    }
}
