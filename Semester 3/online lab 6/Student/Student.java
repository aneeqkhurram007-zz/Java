import java.util.*;

/**
 * Student
 */
public class Student {
    private String name;

    private ArrayList<String> listOfCourses = new ArrayList<String>(5);
    private ArrayList<Float> listOfQuizes;

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

    public Student(String name, ArrayList<String> listOfCourses, ArrayList<Float> listOfQuizes, int numOfQuiz) {
        setName(name);
        this.listOfQuizes = new ArrayList<Float>(numOfQuiz);
        for (int i = 0; i < listOfCourses.size(); i++) {
            this.listOfCourses.add(listOfCourses.get(i));
        }
        for (int i = 0; i < listOfQuizes.size(); i++) {
            this.listOfQuizes.add(listOfQuizes.get(i));
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