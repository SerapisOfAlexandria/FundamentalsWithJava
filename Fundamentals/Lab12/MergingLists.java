package Fundamentals.Lab12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numberGroupOne =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> numberGroupTwo =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String mergedGroups = "";

        while (numberGroupOne.size() != 0 || numberGroupTwo.size() != 0) {

            if (numberGroupOne.size() != 0) {
                mergedGroups += numberGroupOne.get(0) + " ";
                numberGroupOne.remove(0);
            }

            if (numberGroupTwo.size() != 0) {
                mergedGroups += numberGroupTwo.get(0) + " ";
                numberGroupTwo.remove(0);
            }

        }

        System.out.println(mergedGroups);
    }
}
