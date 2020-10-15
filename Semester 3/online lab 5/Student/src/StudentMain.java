
/**
 * StudentMain
 */
import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student("Aneeq", input.nextFloat());
        Student student1 = new Student(student);

        Student.updateStaticLimit(50);
        System.out.println(student.isPassed());
        student.setMarks(87);
        Student.compare(student, student1);
        input.close();
    }
}