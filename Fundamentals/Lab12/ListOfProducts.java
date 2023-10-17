package Fundamentals.Lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numOfProducts = Integer.parseInt(input.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < numOfProducts; i++) {
            products.add(input.nextLine());
        }


        int countPosition = 0;


        while (true) {
            if (countPosition == products.size()) {
                break;
            }

            int countElements = 0;

            for (int a = countPosition + 1; a <= products.size() - 1; a++) {
                if ((int) products.get(countPosition).charAt(0) > (int) products.get(a).charAt(0)) {
                    switchElements(products, countPosition, a);
                    break;
                } else {
                    countElements++;
                }
            }

            if (countElements == products.size() - countPosition - 1) {
                countPosition++;
            }


        }
        for (int i = 1; i <= products.size(); i++) {
            System.out.printf("%d.%s %n", i, products.get(i - 1));
        }
    }

    public static void switchElements(List<String> list, int elementOne, int elementTwo) {
        String temp = list.get(elementOne);
        list.set(elementOne, list.get(elementTwo));
        list.set(elementTwo, temp);
    }
}
