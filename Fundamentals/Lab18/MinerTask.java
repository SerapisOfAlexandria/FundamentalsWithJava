package Fundamentals.Lab18;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourcesAndQuantity = new LinkedHashMap<>();

        while (true) {
            String resource = input.nextLine();

            if (resource.equals("stop")) {
                break;
            }

            int quantity = Integer.parseInt(input.nextLine());

            if (resourcesAndQuantity.containsKey(resource)) {
                resourcesAndQuantity.put(resource, resourcesAndQuantity.get(resource) + quantity);
            } else {
                resourcesAndQuantity.put(resource, quantity);
            }

        }

        resourcesAndQuantity.entrySet().stream().forEach(x -> System.out.printf("%s -> %d%n", x.getKey(), x.getValue()));
    }
}
