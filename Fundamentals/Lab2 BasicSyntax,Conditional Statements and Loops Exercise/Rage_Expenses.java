package Fundamentals.Lab2;

import java.util.Scanner;

public class Rage_Expenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lostGames = Integer.parseInt(input.nextLine());
        double headsetPrice = Double.parseDouble(input.nextLine());
        double mousePrice = Double.parseDouble(input.nextLine());
        double keyboardPrice = Double.parseDouble(input.nextLine());
        double displayPrice = Double.parseDouble(input.nextLine());

        double totalExpenses = ((lostGames / 2) * headsetPrice) + ((lostGames / 3) * mousePrice) + ((lostGames / 6) * keyboardPrice) + ((lostGames / 12) * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
