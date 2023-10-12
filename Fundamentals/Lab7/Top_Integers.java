package Fundamentals.Lab7;

import java.util.Scanner;

public class Top_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputArr = input.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i <= inputArr.length - 1; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        String topInts = "";

        for (int i = 0; i <= numbersArr.length - 2; i++) {

            boolean isBigger = true;

            for (int a = i + 1; a <= numbersArr.length - 1; a++) {
                if (numbersArr[i] > numbersArr[a]) {

                } else {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                topInts += numbersArr[i] + " ";
            }
        }
        topInts += numbersArr[numbersArr.length - 1] + " ";

        System.out.println(topInts);
    }
}
