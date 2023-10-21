package Fundamentals.Lab14;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(input.nextLine().split("!"))
                .collect(Collectors.toList());

        String[] command = input.nextLine().split(" ");
        while (!command[0].equals("Go")) {
            switch (command[0]) {
                case "Urgent":
                    if (!shoppingList.contains(command[1])) {
                        shoppingList.add(0,command[1]);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(command[1]);
                    break;
                case "Correct":
                    int index = shoppingList.indexOf(command[1]);
                    if (index != -1) {
                        shoppingList.set(index, command[2]);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(command[1])) {
                        shoppingList.remove(command[1]);
                        shoppingList.add(command[1]);
                    }
                    break;
            }
            command = input.nextLine().split(" ");
        }
        System.out.println(String.join((", "), shoppingList));
    }
}
