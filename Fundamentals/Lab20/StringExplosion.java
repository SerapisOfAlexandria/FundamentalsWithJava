package Fundamentals.Lab20;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringExplosion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Character> string = new ArrayList<>();
        char[] charredString = input.nextLine().toCharArray();
        StringBuilder finishedString = new StringBuilder();

        for (char a : charredString) {
            string.add(a);
        }
        int pointer = 0;

        while (pointer <= string.size() - 1) {
            if (string.get(pointer) == '>') {
                pointer++;

                for (int i = Character.getNumericValue(string.get(pointer)); i > 0; i--) {
                    if (pointer > string.size() - 1) {
                        break;
                    }
                    if (string.get(pointer) == '>') {
                        pointer++;
                        i += Character.getNumericValue(string.get(pointer)) + 1;
                    } else {
                        string.remove(pointer);
                    }
                }
            } else {
                pointer++;
            }
        }

        System.out.println(string.stream().map(c -> c + "").collect(Collectors.joining("")));
    }
}
