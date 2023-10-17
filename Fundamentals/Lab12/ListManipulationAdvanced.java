package Fundamentals.Lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numList =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "Contains":
                   contains(numList, Integer.valueOf(command[1]));
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        printEvenNumbers(numList);
                    } else {
                        printOddNumbers(numList);
                    }
                    break;
                case "Get":
                    sum(numList);
                    break;
                case "Filter":
                    switch (command[1]) {
                        case ">":
                            filter(numList, ">", Integer.valueOf(command[2]));
                            break;
                        case "<":
                            filter(numList, "<", Integer.valueOf(command[2]));
                            break;
                        case "<=":
                            filter(numList, "<=", Integer.valueOf(command[2]));
                            break;
                        case ">=":
                            filter(numList, ">=", Integer.valueOf(command[2]));
                            break;
                    }
                    break;
            }

            command = input.nextLine().split(" ");
        }
    }

    public static void contains(List<Integer> list, int number) {
        if (list.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenNumbers(List<Integer> list) {
        String evenNums = "";
        for (int i : list) {
            if (i % 2 == 0) {
                evenNums += i + " ";
            }
        }
        System.out.println(evenNums);
    }

    public static void printOddNumbers(List<Integer> list) {
        String oddNums = "";
        for (int i : list) {
            if (i % 2 != 0) {
                oddNums += i + " ";
            }
        }
        System.out.println(oddNums);
    }

    public static void sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void filter(List<Integer> list, String operation, int number) {
        String validElements = "";
        switch (operation) {
            case "<":
                for (int i : list) {
                    if (i < number) {
                        validElements += i + " ";
                    }
                }
                break;
            case ">":
                for (int i : list) {
                    if (i > number) {
                        validElements += i + " ";
                    }
                }
                break;
            case ">=":
                for (int i : list) {
                    if (i >= number) {
                        validElements += i + " ";
                    }
                }
                break;
            case "<=":
                for (int i : list) {
                    if (i <= number) {
                        validElements += i + " ";
                    }
                }
                break;
        }
        System.out.println(validElements);
    }
}