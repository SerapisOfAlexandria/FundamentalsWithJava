package Fundamentals.Lab18;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        LinkedHashMap<String, String> registeredClients = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] registrationForm = input.nextLine().split(" ");
            String command = registrationForm[0];
            String username = registrationForm[1];
            String licencePlateNumber = "";
            if (registrationForm.length == 3) {
                licencePlateNumber = registrationForm[2];
            }


            if (command.equals("register")) {
                if (registeredClients.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licencePlateNumber);
                    continue;
                } else {
                    registeredClients.put(username, licencePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licencePlateNumber);
                }
            } else {
                if (!registeredClients.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
                else {
                    System.out.printf("%s unregistered successfully%n", username);
                    registeredClients.remove(username);
                }
            }
        }

        registeredClients.entrySet().stream()
                .forEach(x -> System.out.printf("%s => %s%n", x.getKey(), x.getValue()));
    }
}
