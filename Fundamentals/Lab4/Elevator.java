package Fundamentals.Lab4;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        int courses = people / capacity;

        if (people % capacity != 0) {
            courses++;
        }

        System.out.println(courses);

    }
}
