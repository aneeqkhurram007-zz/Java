
import java.util.*;

public class AccountMain {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Account acc1 = new Account(35201, "Aneeq Khurram", 21);

        Account acc2 = new Account(acc1);

        acc2.setAge(30);
        acc2.setAccountName("Murshad");
        acc1.display();
        acc2.display();
        input.close();
    }

}
