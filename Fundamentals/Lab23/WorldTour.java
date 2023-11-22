package Fundamentals.Lab23;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldTour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder destinations = new StringBuilder(input.nextLine());
        String[] command = input.nextLine().split(":");
        Pattern patternWord = Pattern.compile("[A-Z][a-z]+");
        Pattern patternNumber = Pattern.compile("\\d+");


        while (!Arrays.stream(command).anyMatch( x -> x.equals("Travel"))) {
            switch (command[0]) {
                case "Add Stop":
                    if (Integer.valueOf(command[1]) >= 0 && Integer.valueOf(command[1]) <= destinations.length() - 1) {
                        destinations.insert(Integer.valueOf(command[1]), command[2]);
                    }

                    System.out.println(destinations);
                    break;
                case "Remove Stop":
                    Matcher matcher1 = patternNumber.matcher(command[1]);
                    Matcher matcher2 = patternNumber.matcher(command[2]);

                    if ((matcher1.find() && matcher2.find())) {
                        if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[2]) <= destinations.length() - 1) {
                            destinations.replace(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1, "");
                        }
                    }

                    System.out.println(destinations);
                    break;
                case "Switch":
                    if (!(destinations.indexOf(command[1]) == -1)) {
                        destinations = replaceAll(destinations, command[1], command[2]);
                    }

                    System.out.println(destinations);
                    break;
            }

            command = input.nextLine().split(":");
        }

        System.out.printf("Ready for world tour! Planned stops: %s", destinations);
    }

    public static StringBuilder replaceAll(StringBuilder text, String stringToBeReplaced, String replaceString) {
        String filteredString = String.valueOf(text).replaceAll(stringToBeReplaced, replaceString);
        StringBuilder finishedString = new StringBuilder(filteredString);

        return finishedString;
    }
}
