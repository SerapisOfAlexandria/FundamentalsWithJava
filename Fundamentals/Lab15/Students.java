package Fundamentals.Lab15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String[]> studentInfoList = new ArrayList<String[]>();
        String studentInfo = input.nextLine();

        while (!studentInfo.equals("end")) {
            studentInfoList.add(studentInfo.split(" "));
            studentInfo = input.nextLine();
        }

        String town = input.nextLine();

        for (int i = 0; i <= studentInfoList.size() - 1; i++) {
            String studentName = studentInfoList.get(i)[0];
            String studentLastName = studentInfoList.get(i)[1];
            int studentAge = Integer.parseInt(studentInfoList.get(i)[2]);
            String residingTown = studentInfoList.get(i)[3];

            Student x = new Student(studentName, studentLastName, studentAge, residingTown);

            if (x.isFromTown(town)) {
                System.out.printf("%s %s is %d years old%n", x.firstname, x.lastname, x.age);
            }
        }

    }
}

