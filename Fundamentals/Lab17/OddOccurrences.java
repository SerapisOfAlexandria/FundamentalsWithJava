package Fundamentals.Lab17;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = input.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <= words.length - 1; i++) {
            String word = words[i].toLowerCase();


            if (!map.containsKey(word)) {
                map.put(word.toLowerCase(), 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        ArrayList<String> oddWords = new ArrayList<>();

        for (String a : map.keySet()) {
            if (map.get(a) % 2 != 0) {
                oddWords.add(a);
            }
        }

        System.out.println(oddWords.toString().replace("[", "").replace("]", ""));
    }
}
