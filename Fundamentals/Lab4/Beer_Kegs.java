package Fundamentals.Lab4;

import java.util.Scanner;

public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfKegs = Integer.parseInt(input.nextLine());
        String biggestKeg = "";
        double biggestKegVolume = 0;

        for (int i = 0; i < numOfKegs; i++) {
            String kegName = input.nextLine();
            double radius = Double.parseDouble(input.nextLine());
            double height = Double.parseDouble(input.nextLine());

            double volume = 3.14 * (radius * radius) * height;

            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKeg = kegName;
            }

        }

        System.out.println(biggestKeg);
    }
}
