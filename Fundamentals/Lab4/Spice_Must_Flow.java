package Fundamentals.Lab4;

import java.util.Scanner;

public class Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long startingYield = Long.parseLong(input.nextLine());
        int totalYield = 0;
        int days = 0;

        while(startingYield >= 100) {
            totalYield += startingYield - 26;
            days++;
            startingYield -= 10;
        }

        if (totalYield < 26) {
            totalYield = 0;
        } else {
            totalYield -= 26;
        }

        System.out.println(days);
        System.out.println(totalYield);
    }
}
