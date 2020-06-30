//package onlineLab3;

import java.util.*;

public class lab1 {
    public static void main(String[] args) {
        char ch;
        int n, i = 1, terms = 5;
        System.out.println("Enter a number: ");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        while (!(n > 1 && n < 21)) {
            System.out.println("\nEnter a number: ");
            n = num.nextInt();
        }

        while (i <= terms) {
            System.out.println(n + " * " + i + " = " + n * i);
            if (i % 5 == 0) {
                System.out.println("Press ESC to exit or any key to continue");

                ch = num.next().charAt(0);
                System.out.print("\n You pressed: " + ch);
                int ascii = ch;

                if (ascii != 27) {
                    terms = terms + 5;
                }

            }
            i++;
        }
        num.close();
    }
}