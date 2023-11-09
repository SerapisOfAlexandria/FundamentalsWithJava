package Fundamentals.Lab18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<Double>> gradeMap = new LinkedHashMap<>();
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            Double grade = Double.parseDouble(input.nextLine());

            if (gradeMap.containsKey(name)) {
                gradeMap.get(name).add(grade);
            } else {
                gradeMap.put(name, new ArrayList<>(Arrays.asList(grade)));
            }
        }

        gradeMap.entrySet().stream()
                .filter(x -> x.getValue()
                        .stream()
                        .mapToDouble(Double::doubleValue).sum() / x.getValue().size() >= 4.5 )
                .forEach(x -> System.out.printf("%s -> %.2f%n", x.getKey(), x.getValue().stream()
                                                                                            .mapToDouble(Double::doubleValue).
                                                                                            sum()
                                                                                            / x.getValue().size()));
    }
}
