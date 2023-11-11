package Fundamentals.Lab18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> employeesInCompanies = new LinkedHashMap<>();
        String[] companyAndEmploye = input.nextLine().split(" -> ");

        while (!companyAndEmploye[0].equals("End")) {
            String company = companyAndEmploye[0];
            String employee = companyAndEmploye[1];

            if (employeesInCompanies.containsKey(company)) {
                if (!employeesInCompanies.get(company).stream().anyMatch(entry -> entry.equals(employee))) {
                    employeesInCompanies.get(company).add(employee);
                }
            } else {
                employeesInCompanies.put(company, new ArrayList<>(Arrays.asList(employee)));
            }

            companyAndEmploye = input.nextLine().split(" -> ");
        }

        employeesInCompanies.entrySet().stream()
                .map(entry -> entry.getKey() + "\n" +
                        entry.getValue().stream()
                                .map(empl -> "-- " + empl)
                                .collect(Collectors.joining("\n")))
                .forEach(System.out::println);

    }
}
