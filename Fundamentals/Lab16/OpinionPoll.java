package Fundamentals.Lab16;

import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = input.nextLine().split(" ");
            Person x = new Person(info[0], Integer.parseInt(info[1]));

            if (x.isAboveThirty()) {
                System.out.printf("%s - %d%n", x.name, x.age);
            }
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAboveThirty() {
        if (age > 30) {
            return true;
        } else {
            return false;
        }
    }
}
