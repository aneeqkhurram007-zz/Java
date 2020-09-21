
import java.util.*;

public class ass3 {
    public static void main(String[] args) {
        String name;
        float obt_marks, total_marks, percent;
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter: ");
        do {
            input.nextLine();
            System.out.println("Enter your name: ");
            name = input.nextLine();
            System.out.println("Enter obt marks: ");
            obt_marks = input.nextFloat();
            if (obt_marks == -1) {
                break;
            }
            System.out.println("Enter total marks: ");
            total_marks = input.nextFloat();
            percent = obt_marks / total_marks;

            System.out.println(name + " " + percent * 100 + "% " + percent);

        } while (obt_marks != -1);
        input.close();
    }
}