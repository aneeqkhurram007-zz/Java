
import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3;
        Scanner num = new Scanner(System.in);
        System.out.println(n1 + "\n" + n2);
        do {
            n3 = n1 + n2;
            if (n3 >= 30000) {
                break;
            }
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;

        } while (n3 < 30000);
        num.close();
    }
}