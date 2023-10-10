package Fundamentals.Lab1;

import java.util.Scanner;

public class Foreign_Languages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String country = input.next();

        if (country.equals("USA") || country.equals("England")) {
            System.out.println("English");
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
