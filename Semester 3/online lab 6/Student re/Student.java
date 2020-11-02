import java.util.*;

public class Student {
    private String name;
    private ArrayList<String> listOfCourse = new ArrayList<String>();

    private ArrayList<Float> listOfQuiz = new ArrayList<Float>();
    private static double passLimit = 33;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getListOfCourse() {
        return this.listOfCourse;
    }

    public void setListOfCourse(ArrayList<String> listOfCourse) {
        this.listOfCourse = listOfCourse;
    }

    public ArrayList<Float> getListOfQuiz() {
        return this.listOfQuiz;
    }

    public void setListOfQuiz(ArrayList<Float> listOfQuiz) {
        this.listOfQuiz = listOfQuiz;
    }

    public static void setPassLimit(double limit) {
        passLimit = limit;

    }

    public static double getPassLimit() {
        return passLimit;
    }

    public Student(String name, ArrayList<String> listOfCourse, ArrayList<Float> listOfQuiz) {
        setName(name);
        setListOfCourse(listOfCourse);
        setListOfQuiz(listOfQuiz);

    }

    public void printInfo() {
        System.out.println("\nName of a Student: " + this.name);
        System.out.println("\nCourse Data:");
        for (String string : listOfCourse) {
            System.out.println(string);
        }
        System.out.println("\nQuiz Data:");
        for (float float1 : listOfQuiz) {
            System.out.println(float1);
        }
    }

    public void dropCourse(String course) {
        listOfCourse.remove(course);
    }

    public void regCourse(String course) {
        listOfCourse.add(course);
    }

    public static int getPassedQuizzes(ArrayList<Float> listOfQuiz) {
        int count = 0;
        for (Float element : listOfQuiz) {
            if (element > passLimit) {
                count++;
            }
        }

        return count;
    }
}