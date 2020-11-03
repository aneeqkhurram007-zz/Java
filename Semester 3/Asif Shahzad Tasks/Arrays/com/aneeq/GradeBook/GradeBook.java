package com.aneeq.GradeBook;

// import com.aneeq.*;
import lms.com.StudentGrade.*;

/**
 * GradeBook
 */
public class GradeBook {
    private String courseName;
    private Student[] students;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public GradeBook(String courseName, Student[] students) {
        setCourseName(courseName);
        setStudents(students);
    }

    public void maxAverage() {
        double maxAverage = students[0].averageMarks();
        for (int i = 0; i < students.length; i++) {
            if (maxAverage < students[i].averageMarks()) {
                maxAverage = students[i].averageMarks();
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (maxAverage == students[i].averageMarks()) {
                System.out.println("Student who got max Average is: " + students[i].getId());
            }
        }

    }

    public void allAverage() {
        for (Student student : students) {
            System.out.println(student.averageMarks());
        }
    }

    public void classAverage() {
        double sum = 0;
        double average;
        for (Student student : students) {
            sum = sum + student.averageMarks();
        }
        average = sum / students.length;
        System.out.println("Average marks of the class is: " + average);

    }

    public void allMinMarks() {
        for (Student student : students) {
            System.out.println(student.minMarks());
        }
    }

    public void allMaxMarks() {
        for (Student student : students) {
            System.out.println(student.maxMarks());
        }
    }

    public void maxTestNumber() {

        for (Student student : students) {
            student.maxTest();
        }
    }

    public void displayData(int id) {
        System.out.println("Average Marks = " + students[id].averageMarks());
        System.out.println("Minimum Marks = " + students[id].minMarks());
        System.out.println("Maximum Marks = " + students[id].maxMarks());

    }
}