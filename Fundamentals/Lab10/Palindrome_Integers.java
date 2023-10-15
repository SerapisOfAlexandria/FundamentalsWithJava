package Fundamentals.Lab10;

import java.util.Scanner;

public class Palindrome_Integers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String intString = input.nextLine();

        while (!intString.equals("END")) {

            System.out.println(isPalindrome(intString));
            intString = input.nextLine();
        }
    }

    public static boolean isPalindrome(String n) {
        for (int i = 0; i <= (n.length() - 1) / 2; i++) {
            if (n.charAt(0 + i) != n.charAt((n.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
