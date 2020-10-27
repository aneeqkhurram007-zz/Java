import java.util.*;

public class StudentTest {
    static Scanner input = new Scanner(System.in);
    static int numOfQuiz;

    public static void main(String[] args) {
        Student[] students;
        ArrayList<String> listOfCourse = new ArrayList<String>();

        System.out.print("Enter number of students: ");
        students = new Student[input.nextInt()];

        listOfCourse = listOfCourse();

        System.out.print("Enter number of quiz: ");
        numOfQuiz = input.nextInt();

        for (int i = 0; i < students.length; i++) {
            System.out.println("\tEnter data for Student " + (i + 1));

            System.out.print("Enter your name: ");
            input.nextLine();
            students[i] = new Student(input.nextLine(), listOfCourse, listOfQuiz());
        }

        System.out.println("\n\tStudent Data");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
            System.out.println("Number of Passed Quizzes: " + Student.getPassedQuizzes(students[i].getListOfQuiz()));
        }
    }

    public static ArrayList<String> listOfCourse() {
        int tempSize = 5;
        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("Enter name of your courses: ");
        input.nextLine();

        for (int i = 0; i < tempSize; i++) {
            arrayList.add(input.nextLine());
        }
        return arrayList;
    }

    public static ArrayList<Float> listOfQuiz() {
        ArrayList<Float> arrayList = new ArrayList<Float>();

        System.out.println("Enter your quiz numbers: ");
        for (int i = 0; i < numOfQuiz; i++) {
            arrayList.add(input.nextFloat());
            while (arrayList.get(i) < 0) {
                System.out.print("Try Again. You entered Invalid value: ");
                arrayList.set(i, input.nextFloat());
            }
        }
        return arrayList;

    }
}
