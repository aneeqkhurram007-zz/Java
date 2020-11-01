
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        ArrayList<String> listOfCourses = new ArrayList<String>(5);
        ArrayList<Float> listOfQuizzes;

        int numOfQuiz;
        int numOfStd;

        Student[] students;

        System.out.print("Enter number of Students: ");
        numOfStd = input.nextInt();

        students = new Student[numOfStd];

        for (int i = 0; i < students.length; i++) {
            listOfCourses.clear();
            System.out.println("\n\tRecord for Student " + (i + 1));
            System.out.println("\nEnter your name: ");
            input.nextLine();
            name = input.nextLine();

            System.out.println("Enter name of your courses: ");

            for (int j = 0; j < 5; j++) {

                listOfCourses.add(input.nextLine());

            }

            System.out.print("Enter number of quizzes: ");
            numOfQuiz = input.nextInt();

            listOfQuizzes = new ArrayList<Float>(numOfQuiz);
            System.out.println("Enter your marks in quizzes: ");
            for (int j = 0; j < numOfQuiz; j++) {

                listOfQuizzes.add(input.nextFloat());
                while (listOfQuizzes.get(j) < 0) {
                    System.out.println("You entered invalid marks. Try Again.");
                    listOfQuizzes.add(input.nextFloat());
                }
            }

            students[i] = new Student(name, listOfCourses, listOfQuizzes, numOfQuiz);

        }

        System.out.println("\n\tStudent Data");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }

        input.close();
    }

}