package Fundamentals.Lab2;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        for (int i = 0; i < 4; i++) {
            String pass = input.nextLine();
            if (pass.equals(reverse(username))) {
                System.out.printf("User %s logged in.", username);
                return;
            }
            if (i == 3 && pass.equals(reverse(username)) == false) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
    }
    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

}
