package Fundamentals.Lab9;

import java.util.Scanner;

public class Calculate_Rectangle_Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(rectangleArea(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
    }

    public static int rectangleArea(int x, int y) {
        return y * x;
    }
}
