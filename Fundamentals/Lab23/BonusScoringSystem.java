package Fundamentals.Lab23;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = Integer.parseInt(input.nextLine());
        double lecturesInCourse = Integer.parseInt(input.nextLine());
        double additionalBonus = Integer.parseInt(input.nextLine());
        double highestBonus = 0;
        int highestAttendedLectures = 0;

        for (int i = 0; i < n; i++) {
            int studentAttendedLectures = Integer.parseInt(input.nextLine());
            double studentBonus = studentAttendedLectures / lecturesInCourse * (5 + additionalBonus);

            if (studentBonus > highestBonus) {
                highestBonus = studentBonus;
                highestAttendedLectures = studentAttendedLectures;
            }
        }

        System.out.printf("Max Bonus: %d.\n", Math.round(highestBonus));
        System.out.printf("The student has attended %d lectures.", highestAttendedLectures);
    }
}
