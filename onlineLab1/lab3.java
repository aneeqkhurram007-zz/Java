
//package onlineLab1;
import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        int num1, num2, sum = 0, i;
        Scanner num = new Scanner(System.in);
        System.out.println("\nEnter first integer: ");
        num1 = num.nextInt();
        System.out.println("\nEnter second integer: ");
        num2 = num.nextInt();
        i = num1;
        while (i <= num2) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("\nThe sum is: " + sum);
        num.close();
    }
}