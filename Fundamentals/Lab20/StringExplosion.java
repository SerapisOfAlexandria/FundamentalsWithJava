package Lab20;

import java.util.ArrayList;
import java.util.Scanner;
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
//                for (int i = pointer; i <= pointer + )
            }
        }
    }

    public static void explode(int pointer, ArrayList<String> symbolList) {

    }
}
