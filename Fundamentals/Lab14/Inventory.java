package Fundamentals.Lab14;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> journal = Arrays.stream(input.nextLine().split(", "))
                .map(String::valueOf)
                .collect(Collectors.toList());

        String[] command = input.nextLine().split(" ");

        while (!command[0].equals("Craft!")) {
            switch (command[0]) {
                case "Collect":
                    if (!journal.contains(command[2])) {
                        journal.add(command[2]);
                    }
                    break;
                case "Drop":
                        journal.remove(command[2]);
                        break;
                case "Combine":
                    String[] items = command[3].split(":");
                    if (journal.contains(items[0])) {
                        journal.add(journal.indexOf(items[0]) + 1, items[1]);
                    }
                    break;
                case "Renew":
                    if (journal.contains(command[2])) {
                        journal.remove(command[2]);
                        journal.add(command[2]);
                    }
                    break;
            }
            command = input.nextLine().split(" ");
        }
        System.out.println(String.join((", "), journal));
    }
}
