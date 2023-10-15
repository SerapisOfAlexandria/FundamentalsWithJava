package Fundamentals.Lab10;

import java.util.Scanner;

public class Password_Validator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password = input.nextLine();
        passwordValidator(password);
    }

    public static void passwordValidator(String password) {
        String symbols = "!@#$%^&*()_-+={}[]|\\:;\"'<>,.?/~`";
        String digits = "0123456789";
        boolean validPassword = true;

        if (password.length() >= 6 && password.length() <= 10) {

        } else {
            System.out.println("Password must be between 6 and 10 characters");
            validPassword = false;
        }

            int digitSum = 0;

            for (int i = 0; i <= password.length() - 1; i++) {
                if (symbols.contains(String.valueOf(password.charAt(i)))) {
                    System.out.println("Password must consist only of letters and digits");
                    validPassword = false;
                    break;
                } else if (digits.contains(String.valueOf(password.charAt(i)))) {
                    digitSum++;
                }
            }

            if (digitSum < 2) {
                System.out.println("Password must have at least 2 digits");
                validPassword = false;
            }

            if (validPassword) {
                System.out.println("Password is valid");
            }
    }
}
