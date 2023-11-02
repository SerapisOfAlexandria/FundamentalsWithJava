package Fundamentals.Lab17;

import com.sun.source.tree.Tree;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = Arrays.stream(input.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> map = new TreeMap<>();

        for (double number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> kvp : map.entrySet()) {
            String keyFormatted = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d%n", keyFormatted, kvp.getValue());

        }

    }
}