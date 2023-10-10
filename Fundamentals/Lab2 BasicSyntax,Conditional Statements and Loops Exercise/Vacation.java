package Fundamentals.Lab2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeOfGroup = Integer.parseInt(input.nextLine());
        String typeOfGroup = input.nextLine();
        String dayOfTheWeek = input.nextLine();

        // Price per person
        double ppp = 0;
        double total = 0;

        if (typeOfGroup.equals("Students")) {
            if (dayOfTheWeek.equals("Friday")) {
                ppp = 8.45;
            } else if (dayOfTheWeek.equals("Saturday")) {
                ppp = 9.80;
            } else {
                ppp = 10.46;
            }
            if (sizeOfGroup >= 30) {
                total = (ppp * sizeOfGroup) * .85;
            } else {
                total = ppp * sizeOfGroup;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (dayOfTheWeek.equals("Friday")) {
                ppp = 10.90;
            } else if (dayOfTheWeek.equals("Saturday")) {
                ppp = 15.60;
            } else {
                ppp = 16;
            }
            if (sizeOfGroup >= 100) {
                total = (ppp * sizeOfGroup) - (ppp * 10);
            } else {
                total = ppp * sizeOfGroup;
            }
        } else {
            if (dayOfTheWeek.equals("Friday")) {
                ppp = 15;
            } else if (dayOfTheWeek.equals("Saturday")) {
                ppp = 20;
            } else {
                ppp = 22.50;
            }
            if (sizeOfGroup >= 10 && sizeOfGroup <= 20) {
                total = (ppp * sizeOfGroup) * .95;
            } else {
                total = ppp * sizeOfGroup;
            }
        }

        System.out.printf("Total price: %.2f", total);

    }
}
