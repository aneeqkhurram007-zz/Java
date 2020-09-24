import java.util.*;

public class task5 {
    public static void main(String[] args) {
        // Get an integer for table number, start value and end value. all integer. your
        // program should print a table... from start to end value. For example, here is
        // sample run:
        // Enter table #: 3
        // Enter start #: 7
        // Enter end #: 9
        // 7 x 3 = 21
        // 8 x 3 = 24
        // 9 x 3 = 27
        Scanner input = new Scanner(System.in);
        int num, start, end;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("Enter a starting value: ");
        start = input.nextInt();
        System.out.println("Enter an ending value: ");
        end = input.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i + " X " + num + " = " + num * i);
        }

        input.close();

    }
}
