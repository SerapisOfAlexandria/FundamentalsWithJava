package Fundamentals.Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int[] pascalTriangle = {1};

        System.out.println(pascalTriangle[0]);

        for (int i = 0; i < rows - 1; i++) {

            int[] temp = new int[pascalTriangle.length + 1];

            for (int a = 0; a <= temp.length - 1; a++) {
                if (a == 0) {
                    temp[0] = 1;
                } else if (a == temp.length - 1) {
                    temp[temp.length - 1] = 1;
                } else {
                 temp[a] = pascalTriangle[a - 1] + pascalTriangle[a];
                }
            }

            pascalTriangle = temp;
            System.out.println(Arrays.toString(pascalTriangle).replace("[", "").replace(", ", " ").replace("]", ""));
        }
    }
}
