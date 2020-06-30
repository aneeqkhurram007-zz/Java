import java.util.*;

public class lab3 {

    public static int prime(int x) {
        int flag = 0, i;
        for (i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x, y, i = 1, flag = 0;
        System.out.println("Enter values for X and Y: ");
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
        y = num.nextInt();
        if (prime(x) == 0 && prime(y) == 0) {
            System.out.println("GCD does not exist");
        } else {
            while (i <= x && i <= y) {
                if (x % i == 0 && y % i == 0) {
                    flag = i;
                }
                i++;
            }
            System.out.println("GCD is " + flag);
        }
        num.close();
    }
}