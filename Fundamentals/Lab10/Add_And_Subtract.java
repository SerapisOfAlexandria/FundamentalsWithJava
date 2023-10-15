package Fundamentals.Lab10;

import java.util.Scanner;

public class Add_And_Subtract {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(subtract(sum(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())), Integer.parseInt(input.nextLine())));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
