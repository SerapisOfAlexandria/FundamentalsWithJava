package Fundamentals.Lab13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] dungeonMapping = input.nextLine().split(" |\\|");
        int health = 100;
        int bitcoins = 0;
        int passedRooms = 1;

        for (int i = 0; i <= dungeonMapping.length - 1; i += 2) {

            if (dungeonMapping[i].equals("potion")) {

                passedRooms++;
                if (Integer.parseInt(dungeonMapping[i + 1]) + health > 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - health);
                    health = 100;
                    System.out.printf("Current health: %d hp.%n", health);
                } else if (Integer.parseInt(dungeonMapping[i + 1]) + health < 100) {
                    System.out.printf("You healed for %d hp.%n", Integer.parseInt(dungeonMapping[i + 1]));
                    System.out.printf("Current health: %d hp.%n", health + Integer.parseInt(dungeonMapping[i + 1]));
                    health += Integer.parseInt(dungeonMapping[i + 1]);
                }

            } else if (dungeonMapping[i].equals("chest")) {

                passedRooms++;
                System.out.printf("You found %d bitcoins.%n", Integer.parseInt(dungeonMapping[i + 1]));
                bitcoins += Integer.parseInt(dungeonMapping[i + 1]);

            } else {

                health -= Integer.parseInt(dungeonMapping[i + 1]);
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", dungeonMapping[i]);
                    System.out.printf("Best room: %d", passedRooms);
                    return;
                } else {
                    System.out.printf("You slayed %s.%n", dungeonMapping[i]);
                    passedRooms++;
                }
            }
        }
        System.out.printf("You've made it! %n" +
                "Bitcoins: %d %n" +
                "Health: %d", bitcoins, health);
    }
}
