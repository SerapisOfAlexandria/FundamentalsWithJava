package Fundamentals.Lab18;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] stringItems = input.nextLine().split(" ");
        LinkedHashMap<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        while (true) {
            boolean stopExecution = false;
            for (int i = 0; i <= stringItems.length - 1; i += 2) {
                String item = stringItems[i + 1].toLowerCase();
                int itemQuantity = Integer.parseInt(stringItems[i]);

                if (items.containsKey(item)) {
                    items.put(item, items.get(item) + itemQuantity);
                } else {
                    items.put(item, itemQuantity);
                }

                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    stopExecution = true;
                    break;
                }
                if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    stopExecution = true;
                    break;
                }
                if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    stopExecution = true;
                    break;
                }
            }

            if (stopExecution) {
                items.entrySet().stream()
                        .filter(entry -> entry.getValue() == null)
                        .forEach(entry -> items.put(entry.getKey(), 0));

                items.entrySet().stream().forEach(x -> System.out.printf("%s: %d%n", x.getKey(), x.getValue()));

                break;
            } else {
                stringItems = input.nextLine().split(" ");
            }
        }
    }
}
