package Fundamentals.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class The_Lift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int peopleInLine = Integer.parseInt(input.nextLine());
        String[] inputArr = input.nextLine().split(" ");
        int[] array = new int[inputArr.length];
        for (int i = 0; i <= inputArr.length - 1; i++) {
            array[i] = Integer.parseInt(inputArr[i]);
        }


       for (int i = 0; i < array.length ; i++) {

           if (peopleInLine == 0) {
               break;
           }

           if (array[i] == 4) {
               continue;
           } else {
               if (peopleInLine > 4) {
                   peopleInLine -= 4 - array[i];
                   array[i] += 4 - array[i];
               } else {
                   int availableSpace = 4 - array[i];
                   int peopleToAdd = Math.min(peopleInLine, availableSpace);

                   array[i] += peopleToAdd;
                   peopleInLine -= peopleToAdd;

               }
           }
       }

       if (Arrays.stream(array).sum() < 4 * array.length && peopleInLine == 0) {
           System.out.printf("The lift has empty spots!\n");
           System.out.println(Arrays.toString(array).replace(", ", " ").replace("[", "").replace("]", ""));
       } else if (Arrays.stream(array).sum() == 4 * array.length && peopleInLine > 0) {
           System.out.printf("There isn't enough space! %d people in a queue!\n", peopleInLine);
           System.out.println(Arrays.toString(array).replace(", ", " ").replace("[", "").replace("]", ""));
       } else {
           System.out.println(Arrays.toString(array).replace(", ", " ").replace("[", "").replace("]", ""));
       }
    }
}
