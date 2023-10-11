package Fundamentals.Lab7;

import java.util.Scanner;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int[] passengers = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            passengers[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println(Arrays.toString(passengers).replace(", ", " ").replace("[", "").replace("]", ""));
        System.out.println(Arrays.stream(passengers).sum());

    }
}
