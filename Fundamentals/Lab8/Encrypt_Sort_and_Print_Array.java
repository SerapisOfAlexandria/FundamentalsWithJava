package Fundamentals.Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int names = Integer.parseInt(input.nextLine());
        int[] encryptedNames = new int[names];
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < names; i++) {
            int vowelSum = 0, consonantSum = 0;
            String name = input.nextLine();

            for (int a = 0; a <= name.length() - 1; a++) {
                if (vowels.contains(name.charAt(a) + "")) {
                    vowelSum +=  (int) name.charAt(a) * name.length();
                } else {
                    consonantSum += (int) name.charAt(a) / name.length();
                }
            }

            encryptedNames[i] = consonantSum + vowelSum;
        }

        Arrays.sort(encryptedNames);

        for (int i = 0; i <= encryptedNames.length - 1; i++) {
            System.out.println(encryptedNames[i] + "");
        }
    }
}
