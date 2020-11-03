package com.aneeq.Main;

import java.util.*;
// import com.aneeq.*;
import com.aneeq.GradeBook.*;
import lms.com.StudentGrade.*;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;

        /*
         * GradeBook[] gradeBook = new GradeBook[5];
         * 
         * for (int i = 0; i < gradeBook.length; i++) {
         * 
         * System.out.println("Enter name of your subject: "); gradeBook[i] = new
         * GradeBook(scanner.nextLine(), students()); }
         */
        System.out.print("Enter name of your course: ");
        GradeBook gradeBook = new GradeBook(scanner.nextLine(), students());

        System.out.println("1. Maximum number of tests: ");
        gradeBook.maxTestNumber();

        System.out.println("2. Who got Max Average: ");
        gradeBook.maxAverage();

        System.out.println("Average marks of the class: ");
        gradeBook.classAverage();

        System.out.println("Average marks of each student: ");
        gradeBook.allAverage();

        System.out.println("Minimum marks of each student: ");
        gradeBook.allMinMarks();

        System.out.println("Maximum marks of each student: ");
        gradeBook.allMaxMarks();

        System.out.println("Enter student id for data: ");
        id = scanner.nextInt();

        gradeBook.displayData(id);

        scanner.close();
    }

    public static Student[] students() {
        Student[] students = new Student[50];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1, "Aneeq", marks());
        }
        return students;
    }

    public static int[] marks() {

        int test = random.nextInt(10) + 1;
        int[] marks = new int[test];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(100) + 1;
        }
        return marks;
    }

}
