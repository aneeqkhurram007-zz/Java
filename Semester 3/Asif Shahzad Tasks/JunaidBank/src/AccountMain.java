
import java.util.*;

public class AccountMain {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int cnic, age;
        String accountName;

        Account acc1 = new Account(35201, "Aneeq Khurram", 21);
        System.out.println(acc1.getAccountId());

        Account acc2 = new Account(35201, "Aneeq Khurram", 21);
        System.out.println(acc1.getAccountId());
        input.close();
    }

}
