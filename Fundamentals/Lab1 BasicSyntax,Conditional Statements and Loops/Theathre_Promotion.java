package Fundamentals.Lab1;

import java.util.Scanner;

public class Theathre_Promotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int age = input.nextInt();

        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            if (day.equals("Weekday")) {
                if (age <= 18) {
                    System.out.println("12$");
                } else if (age <= 64){
                    System.out.println("18$");
                } else if (age <= 122) {
                    System.out.println("12$");
                }
            } else if (day.equals("Weekend")) {
                if (age <= 18) {
                    System.out.println("15$");
                } else if (age <= 64) {
                    System.out.println("20$");
                } else if (age <= 122) {
                    System.out.println("15$");
                }
            } else {
                if (age <= 18) {
                    System.out.println("5$");
                } else if (age <= 64) {
                    System.out.println("12$");
                } else if (age <= 122){
                    System.out.println("10$");
                }
            }
        }
    }
}
