package task3;

import java.util.*;

public class gradingProg {
    public static void main(String[] args) {
        double quiz1, quiz2, quiz3, midterm, finalExam, totalGrade, totalMarks;
        Scanner input = new Scanner(System.in);
        System.out.println("\t Final Exams Score");
        do {
            System.out.print("Enter your marks for quiz 1 0/10: ");
            quiz1 = input.nextDouble();
            System.out.print("Enter your marks for quiz 2 0/10: ");
            quiz2 = input.nextDouble();
            System.out.print("Enter your marks for quiz 3 0/10: ");
            quiz3 = input.nextDouble();
            System.out.print("Enter your marks for Mid Terms 0/100: ");
            midterm = input.nextDouble();
            System.out.print("Enter your marks for Final Terms 0/100: ");
            finalExam = input.nextDouble();
        } while (quiz1 > 10 && quiz2 > 10 && quiz3 > 10 && midterm > 100 && finalExam > 100);
        totalMarks = quiz1 + quiz2 + quiz3 + midterm + finalExam;
        totalGrade = (0.4 * finalExam) + (0.35 * midterm) + ((quiz1 + quiz2 + quiz3) / 30) * 25;
        System.out.println("\t Report Card");
        System.out.println("\t Quiz 1 = " + quiz1);
        System.out.println("\t Quiz 2 = " + quiz2);
        System.out.println("\t Quiz 3 = " + quiz3);

        System.out.println("\t Mid Terms = " + midterm);
        System.out.println("\t Final Terms = " + finalExam);
        if ((totalGrade / 100) >= 0.9) {
            System.out.println("\t You got A");
        } else if ((totalGrade / 100) >= 0.8 && (totalGrade / 100) < 0.9) {
            System.out.println("\t You got B");
        } else if ((totalGrade / 100) >= 0.7 && (totalGrade / 100) < 0.8) {
            System.out.println("\t You got C");
        } else if ((totalGrade / 100) >= 0.6 && (totalGrade / 100) < 0.7) {
            System.out.println("\t You got D");
        } else {
            System.out.println("\t You got F");
        }

        System.out.printf("\nTotal Marks out of 230 are %d : ", (int) totalMarks);
        input.close();
    }
}
