package Fundamentals.Lab6;

import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(input.nextLine());

        if (n == 1) {
            System.out.println(dayOfTheWeek[0]);
        } else if (n == 2) {
            System.out.println(dayOfTheWeek[1]);
        } else if (n == 3) {
            System.out.println(dayOfTheWeek[2]);
        } else if (n == 4) {
            System.out.println(dayOfTheWeek[3]);
        } else if (n == 5) {
            System.out.println(dayOfTheWeek[4]);
        } else if (n == 6) {
            System.out.println(dayOfTheWeek[5]);
        } else if (n == 7) {
            System.out.println(dayOfTheWeek[6]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
