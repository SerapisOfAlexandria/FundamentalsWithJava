package Fundamentals.Lab23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder validProducts = new StringBuilder();
        String listOfProducts = input.nextLine();
        int totalCalories = 0;
        String regex = "(?<delimeter>[#\\|])(?<itemName>[A-Za-z]+ ?[A-Za-z]+)\\1(?<date>([012][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{2}))\\1(?<calories>10000|\\d{1,4})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(listOfProducts);

        while (matcher.find()) {
            validProducts.append("Item: " + matcher.group("itemName")
                    + ", Best before: " + matcher.group("date")
                    + ", Nutrition: " + matcher.group("calories") + "\n");

            totalCalories += Integer.parseInt(matcher.group("calories"));
        }

        System.out.printf("You have food to last you for: %d days!\n", totalCalories / 2000);
        System.out.println(validProducts);
    }
}
