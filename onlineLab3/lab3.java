//package onlineLab3;

import java.util.*;

public class lab3 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter integer 1 and 2: ");
        n1 = number.nextInt();
        n2 = number.nextInt();
        while (!(n1 % n2 == 0)) {
            System.out.println("They are not dividing each other. ");
            n1 = number.nextInt();
            n1 = number.nextInt();
        }
        System.out.println("They are dividing each other.");
        number.close();
    }
}