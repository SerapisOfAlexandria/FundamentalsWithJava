package Fundamentals.Lab18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Course {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] enrollmentInformation = input.nextLine().split(" : ");
        LinkedHashMap<String, ArrayList<String>> courseAndStudents = new LinkedHashMap<>();

        while (!enrollmentInformation[0].equals("end")) {
            String course = enrollmentInformation[0];
            String student = enrollmentInformation[1];

            if (courseAndStudents.containsKey(course)) {
                courseAndStudents.get(course).add(student);
            } else {
                courseAndStudents.put(course, new ArrayList<>(Arrays.asList(student)));
            }

            enrollmentInformation = input.nextLine().split(" : ");
        }

        courseAndStudents.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().size() + "\n" +
                        entry.getValue().stream()
                                .map(student -> "-- " + student)
                                .collect(Collectors.joining("\n")))
                .forEach(System.out::println);
    }
}
