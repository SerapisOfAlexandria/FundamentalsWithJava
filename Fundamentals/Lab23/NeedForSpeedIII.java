package Fundamentals.Lab23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NeedForSpeedIII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        //Model -> Distance, Fuel
        LinkedHashMap<String, int[]> carsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = input.nextLine().split("\\|");
            carsInfo.put(carInfo[0], new int[]{Integer.parseInt(carInfo[1]), Integer.parseInt(carInfo[2])});
        }

        String[] command = input.nextLine().split("\\s:\\s");

        while(!command[0].equals("Stop")) {
            String carModel = command[1];
            int distance = carsInfo.get(carModel)[0];
            int fuel = carsInfo.get(carModel)[1];

            switch (command[0]) {
                case "Drive":
                    int distanceToBeTravelled = Integer.parseInt(command[2]);
                    int fuelNeeded = Integer.parseInt(command[3]);

                    if (fuelNeeded > fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsInfo.put(carModel, new int[]{distance + distanceToBeTravelled, fuel - fuelNeeded});
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", carModel, distanceToBeTravelled, fuelNeeded);

                        if (distance + distanceToBeTravelled >= 100_000) {
                            System.out.printf("Time to sell the %s!\n", carModel);
                            carsInfo.remove(carModel);
                        }
                    }
                    break;

                case "Refuel":
                    int amountToRefuel = Integer.parseInt(command[2]);
                    int refueledFuel = 0;

                    if (fuel < 75) {
                        if (fuel + amountToRefuel >= 75) {
                            refueledFuel = 75 - fuel;
                            fuel = 75;
                            System.out.printf("%s refueled with %d liters\n", carModel, refueledFuel);
                        } else {
                            fuel += amountToRefuel;
                            System.out.printf("%s refueled with %d liters\n", carModel, amountToRefuel);
                        }
                    } else {
                        System.out.printf("%s refueled with 0 liters\n", carModel);
                    }

                    carsInfo.put(carModel, new int[]{distance, fuel});
                    break;

                case "Revert":
                    int kmToDecrease = Integer.parseInt(command[2]);
                    distance -= kmToDecrease;

                    if (distance < 10000) {
                        distance = 10000;
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers\n", carModel, kmToDecrease);
                    }

                    carsInfo.put(carModel, new int[]{distance, fuel});
                    break;
            }
            command = input.nextLine().split("\\s:\\s");
        }

        System.out.println(carsInfo.entrySet().stream()
                .map(entry -> entry.getKey() + " -> Mileage: " + entry.getValue()[0] + " kms, Fuel in the tank: " + entry.getValue()[1] + " lt.")
                .collect(Collectors.joining("\n")));
    }
}
