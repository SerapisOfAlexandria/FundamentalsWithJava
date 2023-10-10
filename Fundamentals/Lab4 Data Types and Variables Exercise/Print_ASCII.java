package Fundamentals.Lab4;

import java.util.Scanner;

public class Print_ASCII  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startingIndex = Integer.parseInt(input.nextLine());
        int endingIndex = Integer.parseInt(input.nextLine());

        for (int i = startingIndex; i <= endingIndex; i++) {
            System.out.printf("%c ",(char) i);
        }
    }
}
