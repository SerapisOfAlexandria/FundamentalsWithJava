package Fundamentals.Lab4;

import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int sum = 0;

        for (int i = 0; i <= n.length() - 1; i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        System.out.println(sum);
    }
}
