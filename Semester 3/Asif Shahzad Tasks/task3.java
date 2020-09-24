import java.util.*;

public class task3 {
    public static void main(String[] args) {
        // Get a 4 digit integer number from user input and print each digits on a
        // separate line.
        Scanner input = new Scanner(System.in);
        int num, quotient, hundereds = 1000;
        System.out.println("Enter a 4 digit number");
        num = input.nextInt();
        while (num != 0) {
            quotient = num / hundereds;
            System.out.println(quotient);
            num = num % hundereds;

            hundereds /= 10;
        }

        input.close();
    }
}
