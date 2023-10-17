package Fundamentals.Lab12;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());


        boolean breakLoop = false;

        while (!breakLoop) {

            for (int i = 0; i < numbers.size(); i++) {

                if (i == numbers.size() - 1) {
                    breakLoop = true;
                    break;
                }

                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    addAdjacentNums(numbers, i, i + 1);
                    break;
                }
            }
        }

        String output = joinElementsByDelimeter(numbers, " ");
        System.out.println(output);
    }

    public static void addAdjacentNums(List<Double> list, int indexOne, int indexTwo) {
        list.add(indexOne, list.get(indexOne) + list.get(indexTwo));
        list.remove(indexOne + 1);
        list.remove(indexOne + 1);
    }

    public static String joinElementsByDelimeter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
