package Fundamentals.Lab9;

import java.util.Scanner;

public class Greater_Of_Two_Values {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String type = input.nextLine();

        if (type.equals("int")) {
            getGreaterValue(input.nextInt(), input.nextInt());
        } else if (type.equals("char")) {
            getGreaterValue(input.nextLine().charAt(0), input.nextLine().charAt(0) );
        } else {
            getGreaterValue(input.nextLine(), input.nextLine());
        }

    }

    public static void getGreaterValue(char x, char y) {
        if ((int) x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        }

    }

    public static void getGreaterValue(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        }

    }

    public static void getGreaterValue(String x, String y) {
        if (x.compareTo(y) > 0) {
            System.out.println(x);
        } else if (x.compareTo(y) < 0) {
            System.out.println(y);
        }

    }
}
