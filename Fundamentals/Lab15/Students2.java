package Fundamentals.Lab15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String[]> studentInfoList = new ArrayList<String[]>();
        List<String[]> studentList = new ArrayList<>();
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
                if (x.isFound(studentName, studentLastName, studentList)) {
                    for (int a = 0; a <= studentList.size() - 1; a++) {
                        if (studentList.get(a)[0].equals(x.firstname) && studentList.get(a)[1].equals(x.lastname)) {
                            studentList.set(a, new String[]{x.firstname, x.lastname, String.valueOf(x.age)});
                        }
                    }
                } else {
                    studentList.add(new String[]{studentName,studentLastName,String.valueOf(studentAge)});
                }
            }
        }

        for (String[] a : studentList) {
            System.out.printf("%s %s is %s years old%n", a[0], a[1], a[2]);
        }
    }
}

class Student {
    String firstname, lastname, town;
    int age;

    public Student(String firstname, String lastname, int age, String town) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.town = town;
        this.age = age;
    }

    public boolean isFromTown(String town) {
        if (this.town.equals(town)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFound(String name, String lastName, List<String[]> a) {
        for (int i = 0; i <= a.size() - 1; i++) {
           if (a.get(i)[0].equals(name) && a.get(i)[1].equals(lastName)) {
               return true;
           }
        }
        return false;
    }
}

