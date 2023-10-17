package Fundamentals.Lab11;

import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String numberToBinary = Integer.toBinaryString(number);
        String modifiedBinary = replaceCharAt(numberToBinary, 0, '0');
        int newNum = Integer.parseInt(modifiedBinary, 2);
        System.out.println(newNum);
    }

    public static String replaceCharAt(String s, int pos, char c) {
        char[] charArray = s.toCharArray();
        charArray[pos] = c;
        return new String(charArray);
    }
}
