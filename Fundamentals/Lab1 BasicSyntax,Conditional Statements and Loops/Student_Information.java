package Fundamentals.Lab1;

import java.util.Scanner;

public class Student_Information {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String age = input.nextLine();
        String grade = input.nextLine();

        System.out.printf("Name: %s, Age: %s, Grade: %s", name, age, grade);

    }
}