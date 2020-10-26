
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String[] listOfCourses = new String[5];
        float[] listOfQuiz;
        int numOfQuiz;
        int numOfStd;

        Student[] students;

        System.out.print("Enter number of Students: ");
        numOfStd = input.nextInt();

        students = new Student[numOfStd];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\n\tRecord for Student " + (i + 1));
            System.out.println("\nEnter your name: ");
            input.nextLine();
            name = input.nextLine();

            System.out.println("Enter name of your courses: ");
            for (int j = 0; j < listOfCourses.length; j++) {

                listOfCourses[j] = input.nextLine();
            }
            System.out.print("Enter number of quizzes: ");
            numOfQuiz = input.nextInt();

            listOfQuiz = new float[numOfQuiz];

            System.out.println("Enter your marks in quizzes: ");
            for (int j = 0; j < listOfQuiz.length; j++) {
                listOfQuiz[j] = input.nextFloat();
                while (listOfQuiz[j] < 0) {
                    System.out.println("You entered invalid marks. Try Again.");
                    listOfQuiz[j] = input.nextFloat();
                }

            }

            students[i] = new Student(name, listOfCourses, listOfQuiz, numOfQuiz);

        }
        System.out.println("\n\tStudent Data");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }

        input.close();
    }
}