package Fundamentals.Lab23;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class ThePianist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        // Database for storing a song along with its composer and key - Name(Composer,Key)
        LinkedHashMap<String, String[]> songInfo = new LinkedHashMap<>();

        for (int i = 0; i <= n - 1; i++) {
            String[] songInput = input.nextLine().split("\\|");
            songInfo.put(songInput[0], new String[]{songInput[1], songInput[2]});
        }

        String[] command = input.nextLine().split("\\|");

        while (!command[0].equals("Stop")) {
            switch (command[0]) {
                case "Add":
                    if (songInfo.containsKey(command[1])) {
                        System.out.printf("%s is already in the collection!\n", command[1]);
                    } else {
                        songInfo.put(command[1], new String[]{command[2], command[3]});
                        System.out.printf("%s by %s in %s added to the collection!\n", command[1], command[2], command[3]);
                    }
                    break;

                case "Remove":
                    if (songInfo.containsKey(command[1])) {
                        System.out.printf("Successfully removed %s!\n", command[1]);
                        songInfo.remove(command[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", command[1]);
                    }
                    break;

                case "ChangeKey":
                    if (songInfo.containsKey(command[1])) {
                        System.out.printf("Changed the key of %s to %s!\n", command[1], command[2]);
                        songInfo.put(command[1], new String[]{songInfo.get(command[1])[0], command[2]});
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", command[1]);
                    }
                    break;
            }

            command = input.nextLine().split("\\|");
        }
        songInfo.entrySet().stream()
                .map(entry -> entry.getKey() + " -> Composer: " + entry.getValue()[0] + ", Key: " + entry.getValue()[1])
                .forEach(System.out::println);
    }
}
