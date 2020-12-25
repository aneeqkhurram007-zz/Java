import java.util.Scanner;
import java.util.StringTokenizer;

public class telephonRe {
    public static void main(String[] args) {
        String phoneNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phone Number (XXX) XXX-XXXX: ");
        phoneNumber = input.nextLine();
        String[] split = phoneNumber.split(" ");
        for (int i = 0; i < 2; i++) {
            System.out.println(split[i]);
        }

    }
}
