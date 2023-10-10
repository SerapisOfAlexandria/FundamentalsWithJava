package Fundamentals.Lab4;

import java.io.*;


public class Poke_Mon {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(input.readLine()); // Poke power
        int m = Integer.parseInt(input.readLine()); // Targets
        int y = Integer.parseInt(input.readLine()); // Exhaustion factor
        int targetCount = 0;
        long nOriginalValueDivided = n / 2;

        while (n >= m) {

            n -= m;
            targetCount++;

            if (n == nOriginalValueDivided && y != 0) {
                n /= y;
            }
        }

        System.out.println(n);
        System.out.println(targetCount);
    }
}
