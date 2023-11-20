package Fundamentals.Lab21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComposeTheRegularExpression {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String regex = "\\+359 2 \\d{3} \\d{4}\\b|\\+359-2-\\d{3}-\\d{4}\\b";
        List<String> matchedCases = new ArrayList<>();
        String cases = input.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cases);

        while (matcher.find()) {
            matchedCases.add(matcher.group());
        }

        System.out.println(String.join(", ", matchedCases));
    }
}
