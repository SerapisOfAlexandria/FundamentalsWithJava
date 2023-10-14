package Fundamentals.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Modifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        String command = input.nextLine();
        while (!command.equals("end")) {
            String[] parts = command.split("\\s+");

            switch (parts[0]) {
                case "swap":
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(parts[1]);
                    index2 = Integer.parseInt(parts[2]);
                    array[index1] *= array[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                    break;
            }

            command = input.nextLine();
        }

        System.out.println(Arrays.toString(array).replace("[", "").replace("]", ""));
    }
}
