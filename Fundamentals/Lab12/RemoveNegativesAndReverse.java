package Fundamentals.Lab12;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numList =
                Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = 0; i <= numList.size() - 1; i++) {
            if (numList.get(i) < 0) {
                numList.remove(i);
                i--;
            }
        }

         if (numList.size() == 0) {
             System.out.println("empty");
         } else {
             Collections.reverse(numList);
             for (int i = 0; i <= numList.size() - 1; i++) {
                 System.out.printf("%d ", numList.get(i));
             }
         }
    }
}
