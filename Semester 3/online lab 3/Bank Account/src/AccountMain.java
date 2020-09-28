import java.util.*;

public class AccountMain {
    public static void main(String[] args) {
        String name;
        double balance = 500;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = input.nextLine();
        Account account = new Account(name, balance);
        account.display();
        input.close();
    }
}
