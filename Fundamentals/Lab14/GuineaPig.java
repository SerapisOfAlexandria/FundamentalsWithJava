package Fundamentals.Lab14;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(input.nextLine());
        double hay = Double.parseDouble(input.nextLine());
        double cover = Double.parseDouble(input.nextLine());
        double guineaPigWeight = Double.parseDouble(input.next());

        for (int i = 1; i <= 30; i++) {

            if (foodQuantity <= 0 || hay <= 0 || cover <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }

            foodQuantity -= .3;
            if (i % 2 == 0) {
                hay -= foodQuantity * .05;
            }
            if (i % 3 == 0) {
                cover -= guineaPigWeight / 3;
            }
        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f", foodQuantity, hay, cover);
    }
}
