package Fundamentals.Lab7;

import java.util.Scanner;

public class Max_Sequence_Of_Equal_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputArr = input.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i <= inputArr.length - 1; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        int longestSequence = 0;
        int longestSequenceNumber = 0;
        int count = 1;
        int lastNumber = -1;

        for (int i = 0; i <= numbersArr.length - 1; i++) {

            if (lastNumber != numbersArr[i]) {
                count = 1;
            } else {
                count++;
            }

            lastNumber = numbersArr[i];

            if (count > longestSequence) {
                longestSequenceNumber = numbersArr[i];
                longestSequence = count;
            }
        }

        for (int i = 0; i < longestSequence; i++) {
            System.out.printf("%d ", longestSequenceNumber);
        }
    }
}
