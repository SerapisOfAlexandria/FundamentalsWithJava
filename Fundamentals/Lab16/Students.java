package Fundamentals.Lab16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static void switchPlace(List<Student> a, int indexOne, int indexTwo) {
        Student temp = a.get(indexOne);
        a.set(indexOne, a.get(indexTwo));
        a.set(indexTwo, temp);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentInfo = input.nextLine().split(" ");
            Student studentEntry = new Student(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));
            studentList.add(studentEntry);
        }

        for (int i = 0; i <= studentList.size() - 2; i++) {
            int count = i + 1;
            while (count <= studentList.size() - 1) {
                if (studentList.get(i).grade > studentList.get(count).grade) {
                    switchPlace(studentList, i, count);
                    count = i + 1;
                } else {
                    count++;
                }
            }
        }

        for (int i = studentList.size() - 1; i >= 0; i--) {
            System.out.printf("%s %s: %.2f\n", studentList.get(i).name, studentList.get(i).lastName, studentList.get(i).grade);
        }
    }
}

class Student {
    String name, lastName;
    double grade;

    public Student(String name, String lastName, double grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }
}
