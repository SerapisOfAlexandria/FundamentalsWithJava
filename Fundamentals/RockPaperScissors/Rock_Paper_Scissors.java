package Fundamentals.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int playerOneScore = 0;
        //player two will be a bot in this case
        int playerTwoScore = 0;
        boolean startGame = false;
        String answer = "";

        System.out.println("Will you play? [YES] / [NO]");

        String playAnswer = input.nextLine();

        if (playAnswer.equals("NO")) {
            System.out.println("Ok. You can try later!");
            return;
        } else {
            startGame = true;
        }

        System.out.println("Just type \"Stop\" if you would like to quit the game.");


        while (startGame) {
            System.out.println("Pick rock, paper or scissors.");
            String botAnswer = "";
            answer = input.nextLine();
            int botPick = rand.nextInt(3) + 1;
            int playerPick = 0;

            if (answer.equals("Stop")) {
                break;
            }

            if (answer.equals("paper")) {
                playerPick = 1;
            } else if (answer.equals("rock")) {
                playerPick = 2;
            } else {
                playerPick = 3;
            }

            if (botPick == 1) {
                botAnswer = "paper";
            } else if (botPick == 2) {
                botAnswer = "rock";
            } else {
                botAnswer = "scissors";
            }

            System.out.printf("Your pick: %s | The bot's pick: %s%n", answer, botAnswer);

            //1 for paper, 2 for rock, 3 scissors
            if (playerPick == 1 && botPick == 2) {
                playerOneScore++;
                System.out.println("Good job! You got the bot! +1 point");
            } else if (botPick == 1 && playerPick == 2) {
                playerTwoScore++;
                System.out.println("Ahh, looks like the bot won this one.");
            } else if (playerPick == 2 && botPick == 3) {
                playerOneScore++;
                System.out.println("Well done! You destroyed the bot's scissors!");
            } else if (botPick == 2 && playerPick == 3) {
                playerTwoScore++;
                System.out.println("Damn this bot, he's so lucky today! He won this round.");
            } else if (playerPick == 3 && botPick == 1) {
                playerOneScore++;
                System.out.println("Ha ha, the bot's paper can't stand in front of your scissors! You get this point!");
            } else if (botPick == 3 && botPick == 1) {
                playerTwoScore++;
                System.out.println("Welp, I guess the bot is lucky.");
            } else {
                System.out.println("Looks like a tie, he got away this time this naughty bot.");
            }
            System.out.println("");
        }

        System.out.printf("Your score : %d | Bot's score : %d%n", playerOneScore, playerOneScore);

        if (playerOneScore > playerTwoScore) {
            System.out.println("Congatulations! You won!");
        } else if (playerOneScore < playerTwoScore) {
            System.out.println("Sorry, maybe next time you'll win.");
        } else {
            System.out.println("The score is even! We have a DRAW!");
        }
    }
}
