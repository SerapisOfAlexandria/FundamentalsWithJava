package Fundamentals.Lab16;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class VehicleCatalogue {

    public static String firstLetterToUpperCase(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Vehicle> vehiclesList = new ArrayList<>();
        String[] vehicleType = input.nextLine().split(" ");

        double trucksTotalHorsePower = 0;
        double carsTotalHorsePower = 0;
        int trucksCount = 0;
        int carsCount = 0;

        while (!vehicleType[0].equals("End")) {
            Vehicle vehicle = new Vehicle(vehicleType[0], vehicleType[1], vehicleType[2], Integer.parseInt(vehicleType[3]));
            vehiclesList.add(vehicle);
            if (vehicle.typeOfVehicle.equals("car")) {
                carsTotalHorsePower += vehicle.horsepower;
                carsCount++;
            } else {
                trucksTotalHorsePower += vehicle.horsepower;
                trucksCount++;
            }
            vehicleType = input.nextLine().split(" ");
        }

        String model = input.nextLine();
        while (!model.equals("Close the Catalogue")) {
            for (int i = 0; i <= vehiclesList.size() - 1; i++) {
                if (vehiclesList.get(i).model.equals(model)) {
                    System.out.printf("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d%n",
                            firstLetterToUpperCase(vehiclesList.get(i).typeOfVehicle), firstLetterToUpperCase(vehiclesList.get(i).model),
                            vehiclesList.get(i).color, vehiclesList.get(i).horsepower);
                }
            }
            model = input.nextLine();
        }

        double averageHorsePowerTrucks = trucksTotalHorsePower / trucksCount;
        double averageHorsePowerCars = carsTotalHorsePower / carsCount;

        if (Double.isNaN(averageHorsePowerTrucks)) {
            averageHorsePowerTrucks = 0;
        }

        if (Double.isNaN(averageHorsePowerCars)) {
            averageHorsePowerCars = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);

    }
}

class Vehicle {

    String typeOfVehicle, model, color;
    int horsepower;

    public Vehicle(String typeOfVehicle, String model, String color, int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
}
