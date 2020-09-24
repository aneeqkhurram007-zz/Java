import java.util.*;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Enter end number");
        num = input.nextInt();
        System.out.println("Special Numbers are: ");
        for (int i = 1; i <= num; i++) {
            if ((i % 2 == 0) && (i % 3 == 0) && (i % 7 != 0)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Special number count is = " + count);
        input.close();
    }
}
