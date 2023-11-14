package Fundamentals.Lab20;

import java.util.Scanner;

// Using Big Integer is forbidden

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder multiplicand = new StringBuilder(input.nextLine());
        int multiple = Integer.parseInt(input.nextLine());

        System.out.println(calculateBig(multiplicand, multiple));

    }

    public static StringBuilder calculateBig(StringBuilder multiplicand, int multiple){
         if (multiple == 0) {
            return new StringBuilder("0");
         }

        StringBuilder product = new StringBuilder();
        int carry = 0;

        for (int i = multiplicand.length() - 1; i >= 0; i--) {
            int multiplication = Character.getNumericValue(multiplicand.charAt(i)) * multiple + carry;
            product.append(multiplication % 10);
            carry = multiplication / 10;
        }

        if (carry != 0) {
            product.append(carry);
        }

        return product.reverse();
    }
}
