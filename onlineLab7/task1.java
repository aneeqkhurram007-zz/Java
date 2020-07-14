
/**
 * task1
 */
import java.util.*;

public class task1 {

    public static void main(String[] args) {
        int[] marks;
        int i;
        marks = new int[10];
        Scanner num = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Enter marks for Subject " + (i + 1) + " : ");
            marks[i] = num.nextInt();
            if (marks[i] > 100) {
                System.out.println("You entered marks greater than 100. Try Again.");
                i--;
            }

        }
        avg(marks);
        num.close();
    }

    public static void avg(int array[]) {
        int i, average = 0;
        System.out.println("Marks entered by the user: ");
        for (i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        for (i = 0; i < 10; i++) {
            average = average + i;
        }
        System.out.println("Average is: " + average / i);
    }
}