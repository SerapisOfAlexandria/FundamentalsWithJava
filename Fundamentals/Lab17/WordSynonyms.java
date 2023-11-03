package Fundamentals.Lab17;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = input.nextLine();
            String value = input.nextLine();

            if (map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(value);
                map.put(key, list);
            } else {
                List<String> listt = new ArrayList<>();
                listt.add(value);
                map.put(key, listt);
            }
        }

        for (String a : map.keySet()) {
            String synonyms = a + " - " +(map.get(a) + "").replace("[", "").replace("]", "");
            System.out.println(synonyms);
        }
    }
}
