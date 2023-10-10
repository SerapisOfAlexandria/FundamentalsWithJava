package Fundamentals.Lab1;

import java.util.Scanner;

public class Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hh = input.nextInt();
        int mm = input.nextInt();

        if (mm + 30 >= 60) {
            hh++;
            if (hh >= 24) {
                hh = 0;
            }
            mm -= 30;
            System.out.printf("%d:%02d", hh, mm);
        } else {
            System.out.printf("%d:%02d", hh, mm + 30);
        }

    }
}
