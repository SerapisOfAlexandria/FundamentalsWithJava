package Fundamentals.Lab7;

import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String stringOne = input.nextLine();
        String stringTwo = input.nextLine();

        String[] firstArr = stringOne.split(" ");
        String[] secondArr = stringTwo.split(" ");
        String commonElements = "";

        for (int i = 0; i <= secondArr.length - 1; i++) {
            for (int a = 0; a <= firstArr.length - 1; a++) {
                if (firstArr[a].equals(secondArr[i])) {
                    commonElements += secondArr[i] + " ";
                }
            }
        }
        System.out.println(commonElements);
    }
}
