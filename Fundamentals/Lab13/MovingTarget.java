package Fundamentals.Lab13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        List<Integer> targetValues = Arrays.stream(input.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("End")) {
            int index = Integer.parseInt(command[1]);
            int value = Integer.parseInt(command[2]);
            
            switch (command[0]) {
                case "Shoot":
                    if (index >= 0 && index < targetValues.size()) {
                        targetValues.set(index, targetValues.get(index) - value);
                        if (targetValues.get(index) <= 0) {
                            targetValues.remove(index);
                        }
                    }
                    break;

                case "Strike":
                    int startIndex = index - value;
                    int endIndex = index + value;
                    if (startIndex >= 0 && endIndex < targetValues.size()) {
                        targetValues.subList(startIndex, endIndex + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;

                case "Add":
                    if (index >= 0 && index < targetValues.size()) {
                        targetValues.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
            }

            command = input.nextLine().split(" ");

        }

        System.out.println(targetValues.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("|")));

    }
}
