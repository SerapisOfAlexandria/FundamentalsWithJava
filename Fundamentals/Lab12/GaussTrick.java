package Fundamentals.Lab12;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int size = numbers.size();

        for (int i = 0; i < size / 2; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }

        String output = joinElementsByDelimeter(numbers, " ");
        System.out.println(output);

    }

    public static String joinElementsByDelimeter(List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
