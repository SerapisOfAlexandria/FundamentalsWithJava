package Fundamentals.Lab23;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(input.nextLine());
        String[] command = input.nextLine().split("\\|");

        while (!command[0].equals("Decode")) {
            switch (command[0]) {
                case "Move":
                    int numOfLettersToBeMoved = Integer.parseInt(command[1]);
                    String lettersToBeMoved = encryptedMessage.substring(0, numOfLettersToBeMoved);
                    encryptedMessage.delete(0, numOfLettersToBeMoved);
                    encryptedMessage.append(lettersToBeMoved);
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String toBeInserted = command[2];
                    encryptedMessage.insert(index, toBeInserted);
                    break;

                case "ChangeAll":
                    String stringToBeReplaced = command[1];
                    String replacement = command[2];
                    int indexOf = encryptedMessage.indexOf(stringToBeReplaced);

                    while (indexOf != -1) {
                        encryptedMessage.replace(indexOf, indexOf + stringToBeReplaced.length(), replacement);
                        indexOf = encryptedMessage.indexOf(stringToBeReplaced);
                    }
                    break;
            }

            command = input.nextLine().split("\\|");
        }

        System.out.println("The decrypted message is: " + encryptedMessage);
    }
}
