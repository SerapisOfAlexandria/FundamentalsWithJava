package Fundamentals.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("I'm thinking of a number between 0 - 1000\nCan you guess it? [Yes] / [No]");
        String answer = input.nextLine();

        if (answer.equals("No")) {
            System.out.println("Okay, maybe try later.");
            return;
        }

        int randomNumber = rand.nextInt(1000) + 1;

        System.out.println("Okay. Let's see if you can guess it! Pick a number: ");

        int guess = Integer.parseInt(input.nextLine());

        while (guess != randomNumber) {
           if (guess < randomNumber) {
               System.out.println("Go up");
           } else if (guess > randomNumber) {
               System.out.println("Go down");
           }
           guess = Integer.parseInt(input.nextLine());
        }
        System.out.println("Congratulations! You've guessed the number!");
    }
}
