import java.util.*;

/**
 * Student
 */
public class Student {
    private String name;
    private String[] listOfCourses = new String[5];
    private float[] listOfQuizes;
    private static double passLimit;
    Scanner inpuScanner = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getPassLimit() {
        return passLimit;
    }

    public static void setPassLimit(double limit) {
        passLimit = limit;
    }

    public Student(String name, String[] listOfCourses, float[] listOfQuizes, int numOfQuiz) {
        setName(name);
        this.listOfQuizes = new float[numOfQuiz];
        for (int i = 0; i < listOfCourses.length; i++) {
            this.listOfCourses[i] = listOfCourses[i];
        }
        for (int i = 0; i < listOfQuizes.length; i++) {
            this.listOfQuizes[i] = listOfQuizes[i];
        }

    }

    public void printInfo() {
        System.out.println("\nName: " + this.name);
        System.out.println("Courses");
        for (String string : listOfCourses) {
            System.out.println(string);
        }
        System.out.println("Quizzes");
        for (Float floats : listOfQuizes) {
            System.out.println(floats);
        }
    }

}