package lms.com.StudentGrade;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private int[] marks;
    private Scanner input = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.print("You Entered wrong Id. Try Again: ");
            this.id = input.nextInt();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int[] marks) {
        setId(id);
        setName(name);
        setMarks(marks);
    }

    public void maxTest() {

        if (getMarks().length == 10) {
            System.out.println("ID = " + getId());
        }

    }

    public double averageMarks() {
        double average;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        average = sum / marks.length;
        return average;
    }

    public int minMarks() {
        int minMarks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (minMarks > marks[i]) {
                minMarks = marks[i];
            }
        }
        return minMarks;
    }

    public int maxMarks() {
        int maxMarks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
            }
        }
        return maxMarks;
    }

}
