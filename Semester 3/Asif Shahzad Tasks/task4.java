import java.util.*;

public class task4 {
    public static void main(String[] args) {
        // Get an integer from user that represent a year, it must be greater than 500,
        // if less, ask again until valid number is entered (hint: use loop to remain
        // asking until valid number is given, when valid number is given break the
        // loop). Your program should print, is the year leap or not. (A leap year is
        // one which is evenly divided by 4. But for century years, the year must also
        // be evenly divided by 400. e.g. 1800 is divisible at 4, but not leap because
        // its a century year and is not evenly divisible at 400. So you must also check
        // whether the user entered year is century year or not to decide correctly)
        Scanner input = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter a year to check leap or not: ");
            year = input.nextInt();
        } while (year <= 500);
        if (year % 400 == 0) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
        input.close();
    }
}
