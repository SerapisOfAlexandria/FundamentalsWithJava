package Fundamentals.Lab23;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DestinationMapper {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String destinations = input.nextLine();
        int travelPoints = 0;
        ArrayList<String> validDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("([/=])(?<name>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(destinations);

        while (matcher.find()) {
            travelPoints += matcher.group(2).length();
            validDestinations.add(matcher.group(2));
        }

        System.out.println("Destinations: " + validDestinations.stream().collect(Collectors.joining(", ")));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
