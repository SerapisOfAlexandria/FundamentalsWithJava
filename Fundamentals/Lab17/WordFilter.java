package Fundamentals.Lab17;


import java.util.*;

public class WordFilter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = Arrays.stream(input.nextLine().split(" "))
                .filter(x -> x.length() % 2 == 0)
                .toArray(String[]::new);

        for (String x : words) {
            System.out.println(x.toString());
        }
    }
}
