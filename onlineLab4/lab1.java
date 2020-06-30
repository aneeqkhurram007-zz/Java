import java.util.*;

public class lab1 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        n1 = num.nextInt();
        do {
            n2 = n1;
            System.out.println("Enter number: ");
            n1 = num.nextInt();
        } while (n1 % n2 != 0);
        System.out.println("They divide each other.");
        num.close();
    }
}