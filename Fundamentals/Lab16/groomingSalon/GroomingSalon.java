package Fundamentals.Lab16.groomingSalon;

import java.util.ArrayList;
import java.util.List;

class GroomingSalon {
    int capacity;
    List<Pet> pets = new ArrayList<>();

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet x) {
        pets.add(x);
        capacity++;
    }

    public boolean removePet(String petName) {
        for (int i = 0; i <= pets.size() - 1; i++) {
            if (pets.get(i).name.equals(petName)) {
                pets.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (int i = 0; i <= pets.size() - 1; i++) {
            if (pets.get(i).name.equals(name) && pets.get(i).owner.equals(owner)) {
                return pets.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        return pets.size();
    }

    public String getStatistics() {
        System.out.printf("The grooming salon has the following clients:%n");
        String petsAndOwners = "";

        for (Pet i : pets) {
            petsAndOwners += i.name + " " + i.owner + "\n";
        }

        return petsAndOwners;
    }
}
