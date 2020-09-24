
/**
 * task6
 */

import java.util.*;

public class task6 {

    public static void main(String[] args) {
        // Write a java program that shall get two numbers from user of double type. It
        // shall print the remainder when first is divided by second. it shall also
        // print ... whether first is divisble by second or not.
        // Example output:
        // Enter first no. 7
        // Enter second num: 2
        // The remainder is 1
        // 7 is not divisible by 2
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        while (num1 % num2 != 0) {
            System.out.println("Remainder is " + (num1 % num2));
            System.out.println(num1 + " is not divisible by " + num2);
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
        }
        System.out.println("Both numbers are divisible by each other.");
        input.close();
    }
}