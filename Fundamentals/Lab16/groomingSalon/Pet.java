package Fundamentals.Lab16.groomingSalon;


import java.util.ArrayList;
import java.util.List;

class Pet {
    String name, owner;
    int age;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String toString() {
        return name + " " + age + " - " + "(" + owner + ")";
    }

}
