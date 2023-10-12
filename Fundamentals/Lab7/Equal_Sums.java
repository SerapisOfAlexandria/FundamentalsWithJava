package Fundamentals.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputArr = input.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i <= inputArr.length - 1; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        String validNumbers = "";

        if (Arrays.stream(numbersArr).sum() - numbersArr[0] == 0) {
            validNumbers += "0";
        }
        if (Arrays.stream(numbersArr).sum() - numbersArr[numbersArr.length - 1] == 0 && !validNumbers.contains("0")) {
            validNumbers += numbersArr.length - 1 + "";
        }



        for (int i = 1; i <= numbersArr.length - 2; i++) {

            int sumLeftGroup = Arrays.stream(numbersArr, 0, i).sum();
            int sumRightGroup = Arrays.stream(numbersArr, i + 1, numbersArr.length).sum();

            if (sumRightGroup == sumLeftGroup) {
                validNumbers += i;
            }
        }

        if (validNumbers.equals("")) {
            System.out.println("no");
        } else {
            System.out.println(validNumbers);
        }

    }
}
