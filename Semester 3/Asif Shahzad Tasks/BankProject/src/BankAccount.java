import java.util.*;

public class BankAccount {
    String name;
    double balance;
    Scanner input = new Scanner(System.in);

    void deposit(double amount) {
        if (balance >= 100000) {
            balance += amount + (0.01 * amount);
        } else {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (balance <= 50000) {
            int choice;
            System.out.println("Are you sure you want to withdraw");
            System.out.print("Press 1 to continue and 0 to abort : ");
            choice = input.nextInt();
            if (choice == 1) {

                balance -= amount - (0.02 * balance);
            }
        }
        balance -= amount;
    }

    void mainDisplay() {
        System.out.println("Prss 1: To Deposit an amount.");
        System.out.println("Prss 2: To Withdraw an amount.");
        System.out.println("Prss 3: To View the current balance.");
        System.out.println("Prss 4: To Close this program.");

    }

    void accountTrans(int countDep, int countWith) {
        System.out.println("Account Title is : " + name);
        System.out.println("Total deposits : " + countDep);
        System.out.println("Total withdraws : " + countWith);
        System.out.println("Balance : " + balance);
    }
}
