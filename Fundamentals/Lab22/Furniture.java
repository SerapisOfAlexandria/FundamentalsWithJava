package Fundamentals.Lab22;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String input = scanner.nextLine();
        System.out.println("Bought furniture: ");
        String regex = ">>(?<itemName>\\w+)<<(?<price>\\d+|\\d+\\.\\d+)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (!input.contains("Purchase")) {
            if (matcher.find()) {
                sum += Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
                System.out.println(matcher.group("itemName"));
            }
            input = scanner.nextLine();
            matcher = pattern.matcher(input);
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
