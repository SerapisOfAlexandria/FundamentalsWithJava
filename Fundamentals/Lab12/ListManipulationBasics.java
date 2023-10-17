package Fundamentals.Lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numList =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("end")) {



            switch (command[0]) {
                case "Add":
                    functionAdd(numList, Integer.valueOf(command[1]));
                    break;
                case "Remove":
                    functionRemove(numList, Integer.valueOf(command[1]));
                    break;
                case "RemoveAt":
                    functionRemoveAt(numList, Integer.valueOf(command[1]));
                    break;
                case "Insert":
                    functionInsert(numList, Integer.valueOf(command[1]), Integer.valueOf(command[2]));
            }

            command = input.nextLine().split(" ");
        }

        System.out.println(numList);
    }

    public static List<Integer> functionAdd(List<Integer> list, int number) {
        list.add(number);
        return list;
    }

    public static List<Integer> functionRemove(List<Integer> list, int number) {
        list.remove(Integer.valueOf(number));
        return list;
    }

    public static List<Integer> functionRemoveAt(List<Integer> list, int index) {
        list.remove(index);
        return list;
    }

    public static List<Integer> functionInsert(List<Integer> list, int number, int index) {
        list.add(index, number);
        return list;
    }
}
