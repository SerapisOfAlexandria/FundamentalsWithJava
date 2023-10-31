package Fundamentals.Lab16;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    public static void switchPlaces(List<Individual> individuals, int indexOne, int indexTwo) {
        Individual temp = individuals.get(indexOne);
        individuals.set(indexOne, individuals.get(indexTwo));
        individuals.set(indexTwo, temp);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Individual> individualList = new ArrayList<>();
        String[] individualInformation = input.nextLine().split(" ");

        while (!individualInformation[0].equals("End")) {
            Individual individual = new Individual(individualInformation[0], individualInformation[1], Integer.parseInt(individualInformation[2]));
            individualList.add(individual);
            individualInformation = input.nextLine().split(" ");
        }


        for (int i = 0; i <= individualList.size() - 1; i++) {
            int count = i + 1;
            while (count <= individualList.size() - 1) {
                if (individualList.get(i).age > individualList.get(count).age) {
                    switchPlaces(individualList, i, count);
                    count = i + 1;
                } else {
                    count++;
                }
            }
        }

        for (Individual i : individualList) {
            System.out.printf("%s with ID: %s is %d years old.%n", i.name, i.ID, i.age);
        }
    }
}

class Individual {
    String name, ID;
    int age;

    public Individual(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

}
