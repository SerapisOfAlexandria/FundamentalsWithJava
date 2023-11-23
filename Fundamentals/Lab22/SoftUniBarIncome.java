package Fundamentals.Lab22;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        String regex = "\\%(?<customerName>[A-Z][a-z]+)\\%[^\\|%$]*?\\<(?<productName>[\\w\\s]+)\\>[^\\|%$]*?\\|(?<quantity>\\d+)\\|[^\\|%$]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (!input.contains("end of shift")) {
            if (matcher.find()) {
                double itemsTotalPrice = Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
                sum += itemsTotalPrice;
                System.out.printf("%s: %s - %.2f\n", matcher.group("customerName"), matcher.group("productName"), itemsTotalPrice);
            }
            input = scanner.nextLine();
            matcher = pattern.matcher(input);
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
