import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.println("Value for x:");
        x = number.nextInt();
        System.out.println("Value for y:");
        y = number.nextInt();
        menu();
        char option;
        option = number.next().charAt(0);
        System.out.println("You entered " + option);
        switch (option) {

            case '1':
                System.out.println("\nMultiplication for the numbers is  " + mul(x, y));
                break;
            case '2':
                System.out.println("\nCombination for the numbers is " + comb(x, y));
                break;

            case '3':
                System.out.println("\nPermiability for the numbers is " + perm(x, y));
                break;

            default:
                System.out.println("\nYou entered invalid choice: ");
                // System.out.println("\nTry Again: ");

                break;
        }
        number.close();
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int comb(int x, int y) {

        return factorial(x) / (factorial(y) * factorial(x - y));
    }

    public static int factorial(int x) {

        if (x <= 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void menu() {

        System.out.println("\nPress 1 for multiplying numbers. ");

        System.out.println("\nPress 2 for finding nCr. ");
        System.out.println("\nPress 3 for finding nPr. ");
        System.out.println("\nYour choice: ");
    }

    public static int perm(int x, int y) {
        return factorial(x) / factorial(x - y);
    }

    /*
     * public static int validate(int x) { do {
     * System.out.println("Enter a number: "); Scanner num = new Scanner(System.in);
     * x = num.nextInt(); num.close(); } while (x < 0);
     * 
     * return x; }
     */

}