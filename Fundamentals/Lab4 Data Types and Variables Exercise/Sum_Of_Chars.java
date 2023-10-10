package Fundamentals.Lab4;

import java.util.Scanner;

public class Sum_Of_Chars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iterations = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = 0; i < iterations; i++) {
            char letter = input.nextLine().charAt(0);
            sum += letter;
        }

        System.out.println(sum);
    }
}
