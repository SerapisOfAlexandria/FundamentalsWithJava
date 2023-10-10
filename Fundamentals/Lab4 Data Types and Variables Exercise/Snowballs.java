package Fundamentals.Lab4;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfSnowballs = Integer.parseInt(input.nextLine());

        double bestValue = -1;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;


        for (int i = 0; i < numOfSnowballs; i++) {
            int snow = Integer.parseInt(input.nextLine());
            int time = Integer.parseInt(input.nextLine());
            int quality = Integer.parseInt(input.nextLine());
            double value = Math.pow((double)snow / time, quality);

            if (bestValue < value) {
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
                bestValue = value;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)%n",bestSnow, bestTime, bestValue, bestQuality);
    }
}

// N - int, number of snowballs made by tony
