package Fundamentals.Lab21;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern ;

public class MatchFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String regex = "(?<wholeName>\\b(?<firstName>[A-Z][a-z]{1,}) (?<lastName>[A-Z][a-z]{1,})\\b)";
        String testCases  = input.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testCases);

        while (matcher.find()) {
            System.out.printf(matcher.group() + " ");
        }
    }
}
