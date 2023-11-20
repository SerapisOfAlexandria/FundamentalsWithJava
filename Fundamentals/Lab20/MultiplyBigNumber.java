package Fundamentals.Lab20;

import java.util.Scanner;

// Using Big Integer is forbidden

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       StringBuilder multiplicand = new StringBuilder(input.nextLine());
       int multiple = Integer.parseInt(input.nextLine());

       StringBuilder product = new StringBuilder();
       int carry = 0;

       for (int position = multiplicand.length() - 1; position >= 0; position--) {
           int digit = Character.getNumericValue(multiplicand.charAt(position));
           int result = digit * multiple + carry;

           carry = result / 10;
           product.insert(0, result % 10);
       }

        System.out.println(product);


    }
}
