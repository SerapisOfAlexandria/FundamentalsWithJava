package Fundamentals.Lab4;

import java.util.Scanner;

public class Water_Overflow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iterations = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = 0; i < iterations; i++) {
            int litersPoured = Integer.parseInt(input.nextLine());

            if (litersPoured + sum > 255) {
                System.out.printf("Insufficient capacity!\n");
            } else if (litersPoured + sum == 255) {
                sum += litersPoured;
            } else {
                sum += litersPoured;
            }
        }
        System.out.println(sum);

    }
}
