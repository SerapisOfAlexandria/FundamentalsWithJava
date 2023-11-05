package Fundamentals.Lab18;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, Double[]> productsInfo = new LinkedHashMap<>();

        while (true) {
            String[] productInfo = input.nextLine().split(" ");
            String productName = productInfo[0];
            if (productName.equals("buy")) {
                break;
            }
            double productPrice = Double.parseDouble(productInfo[1]);
            double quantity = Integer.parseInt(productInfo[2]);


            if (productsInfo.containsKey(productName)) {
                    productsInfo.put(productName, new Double[]{productPrice, productsInfo.get(productName)[1] + quantity});
            } else {
                productsInfo.put(productName, new Double[]{productPrice, quantity});
            }
        }

        productsInfo.entrySet()
                .stream()
                .forEach(x -> System.out.printf("%s -> %.2f%n",
                        x.getKey(),
                        x.getValue()[0] * x.getValue()[1]));
    }
}
