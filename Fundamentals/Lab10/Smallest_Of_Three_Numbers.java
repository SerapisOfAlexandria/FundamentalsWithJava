package Fundamentals.Lab10;

import java.util.Scanner;

public class Smallest_Of_Three_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        getSmallestNumber(input);
    }

    public static void getSmallestNumber(Scanner sc) {
        int smallestNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 2; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }
        System.out.println(smallestNumber);
    }
}
