
/**
 * task7
 */
import java.util.*;

public class task7 {

    public static void main(String[] args) {
        /*
         * 
         * Get applicant age, marks in math, english and science from user. Write a
         * program to find the eligibility of admission for a professional course based
         * on the following criteria: To be eligible for admission, following conditions
         * must be met: Age must be greater than 15 Marks in math should be greater or
         * equals to 65 Marks in english should be greaer or equals to 55 Marks in
         * science must be greater than 50 Total marks of all three subjects must be
         * >=180 Your programs shall print "Eligible for admission" or
         * "Not eligible for admission", depending on data given by user.
         */

        Scanner input = new Scanner(System.in);
        int age, maths, english, science, total;
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your marks in Maths: ");
        maths = input.nextInt();
        System.out.println("Enter your marks in English");
        english = input.nextInt();
        System.out.println("Enter your marks in Science");
        science = input.nextInt();
        total = maths + english + science;
        if ((age > 15) && (maths >= 65) && (english >= 55) && (science > 50) && (total >= 180)) {
            System.out.println("Eligible for admission");
        } else {
            System.out.println("Not eligible for admission");
        }
        input.close();

    }
}