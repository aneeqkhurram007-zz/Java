//package onlineLab2;

/**
 * lab1
 */
public class lab1 {

    public static void main(String[] args) {
        int i, j, a;
        for (i = 0; i < 5; i++) // outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop
                                // for spaces
        {
            System.out.print(" "); // printing space
        }
        for (j = 0; j <= i; j++) // inner loop for columns
        {
            System.out.print("* "); // print star
        }
        System.out.println(); // ending line after each row

        // Part B
        System.out.println("\nPart B\n");
        for (i = 1; i <= 10; i++) {
            for (j = 10; j >= i; j--) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
        // Part C
        System.out.println("\nPart C\n");
        for (i = 1; i <= 10; i++) {
            for (a = 1; a <= i; a++) {
                System.out.println(" ");
            }

            for (j = 10; j >= i; j--) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
        // Part D
        System.out.println("\nPart D\n");
        for (i = 1; i <= 10; i++) {
            for (a = 10; a >= i; a--) {
                System.out.println(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}