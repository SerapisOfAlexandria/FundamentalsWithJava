package Fundamentals.Lab18;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String string = input.nextLine();

        char[] stringToCharArr = string.toCharArray();

        for (char a : stringToCharArr) {
            if (a == ' ') {
                continue;
            }
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        map.entrySet().stream().forEach(x -> System.out.printf("%s -> %s%n", x.getKey(), x.getValue()));
    }
}