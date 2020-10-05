package task4;

public class Student {
    private String studentName, regNumber, degree, department;
    double cgpa;

    public Student(String stName, String rgNum, String deg, String depart, double cgpaMain) {
        studentName = stName;
        regNumber = rgNum;
        degree = deg;
        department = depart;
        cgpa = cgpaMain;
    }

    public void show() {
        System.out.println("\t Student Details");
        System.out.println(studentName);
        System.out.println(regNumber);
        System.out.println(degree);
        System.out.println(department);
        System.out.println(cgpa);
    }

    public static int compare(double A, double B, double C, double D, double E, double F) {
        if (A > B && A > C && A > D && A > E && A > F) {
            return 0;
        } else if (B > A && B > C && B > D && B > E && B > F) {
            return 1;
        } else if (C > B && C > A && C > D && C > E && C > F) {
            return 2;
        } else if (D > B && D > C && D > A && D > E && D > F) {
            return 3;
        } else if (E > B && E > C && E > D && E > A && E > F) {
            return 4;
        } else {
            return 5;
        }
    }

}
