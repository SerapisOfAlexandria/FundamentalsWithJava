package Fundamentals.Lab18;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashSet<String>> forceMap = new LinkedHashMap<>();
        String rawCommand = input.nextLine();
        String[] command = new String[3];
        String side;

        while (!rawCommand.equals("Lumpawaroo")) {

            if (rawCommand.contains("->")) {
                command = rawCommand.split(" -> ");
                String user = command[0];
                side = command[1].trim();

                forceMap.putIfAbsent(side, new LinkedHashSet<>());

                if (doesUserExist(forceMap, user)) {
                    forceMap.values().forEach(set -> set.remove(user));
                    forceMap.get(side).add(user);
                } else if (!doesUserExist(forceMap, user) && !forceMap.containsKey(side)) {
                    forceMap.put(side, new LinkedHashSet<>());
                    forceMap.get(side).add(user);
                } else if (!doesUserExist(forceMap, user) && forceMap.containsKey(side)) {
                    forceMap.get(side).add(user);
                }

                System.out.printf("%s joins the %s side!%n", user, side);
            } else {
                command = rawCommand.split(" \\| ");
                String user = command[1].trim();
                side = command[0];

                if (!doesUserExist(forceMap, user) && !forceMap.containsKey(side)) {
                    forceMap.put(side, new LinkedHashSet<>());
                    forceMap.get(side).add(user);
                } else if (!doesUserExist(forceMap, user)) {
                    forceMap.get(side).add(user);
                }
            }

            rawCommand = input.nextLine();
            command = new String[3];
        }

        forceMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() != 0)
                .map(entry -> "Side: " + entry.getKey() + ", Members: " + entry.getValue().size() + "\n" +
                        entry.getValue().stream()
                                .map(x -> "! " + x)
                                .collect(Collectors.joining("\n")))
                .map(entry -> entry + "\n")
                .forEach(System.out::printf);


    }


    public static boolean doesUserExist(LinkedHashMap<String, LinkedHashSet<String>> map, String user) {
        return map.values().stream().anyMatch(entry -> entry.contains(user));
    }

    public static void removeUser(LinkedHashMap<String, LinkedHashSet<String>> map, String user) {
        map.values().forEach(entry -> entry.remove(user));
    }
}


