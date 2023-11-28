package Fundamentals.Lab23;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pirates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, int[]> towns = new LinkedHashMap<>();
        String[] command = input.nextLine().split("\\|\\|");

        while(!command[0].equals("Sail")) {
            String town = command[0];
            int population = Integer.valueOf(command[1]);
            int gold = Integer.valueOf(command[2]);

            if (towns.containsKey(town)) {
                int currentPopulation = towns.get(town)[0];
                int currentGoldQuantity = towns.get(town)[1];

                towns.put(town, new int[]{population + currentPopulation, gold + currentGoldQuantity});
            } else {
                towns.put(town, new int[]{population, gold});
            }

            command = input.nextLine().split("\\|\\|");
        }

        command = input.nextLine().split("=>");

        while (!command[0].equals("End")) {
            String town = command[1];
            int townPopulation = towns.get(town)[0];
            int townGold = towns.get(town)[1];

            switch (command[0]) {
                case "Plunder":
                    int peopleToKill =  Integer.valueOf(command[2]);
                    int goldToPlunder = Integer.valueOf(command[3]);


                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, goldToPlunder, peopleToKill);

                    if (townPopulation - peopleToKill == 0 || townGold - goldToPlunder == 0) {
                        towns.remove(town);
                        System.out.printf("%s has been wiped off the map!\n", town);
                    } else {
                        towns.put(town, new int[]{townPopulation - peopleToKill, townGold - goldToPlunder});
                    }

                    break;

                case "Prosper":
                    int goldIncrease = Integer.valueOf(command[2]);

                    if (goldIncrease < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        towns.put(town, new int[]{townPopulation, townGold + goldIncrease});
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldIncrease, town, townGold + goldIncrease);
                    }
                    break;
            }

            command = input.nextLine().split("=>");
        }

        if (towns.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println("Ahoy, Captain! There are " + towns.size() + " wealthy settlements to go to:");
            System.out.println(towns.entrySet().stream()
                    .map(entry -> entry.getKey() + " -> Population: " + entry.getValue()[0] + " citizens, Gold: " + entry.getValue()[1] + " kg")
                    .collect(Collectors.joining("\n")));
        }
    }
}
