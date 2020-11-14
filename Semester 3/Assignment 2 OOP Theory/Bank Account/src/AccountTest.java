import java.util.*;

public class AccountTest {
    static Scanner input = new Scanner(System.in);;
    static long accountNumber;
    static String accountTitle;
    static String cnic;
    static double balance;

    public static void main(String[] args) {
        int choice;
        char option;
        Account[] account = new Account[5];
        CurrentAccount[] curreAccount = new CurrentAccount[5];
        SavingAccount[] savingAccount = new SavingAccount[5];

        int i = 0, j = 0, k = 0;

        do {
            choice = display();

            switch (choice) {
                case 1:
                    entries();

                    curreAccount[j] = new CurrentAccount();
                    curreAccount[j].addAccount(cnic, accountTitle, balance, accountNumber, 5);
                    curreAccount[j].checkBalance();

                    j++;
                    break;
                case 2:
                    entries();
                    savingAccount[k] = new SavingAccount();
                    savingAccount[k].addAccount(cnic, accountTitle, balance, accountNumber, 5);
                    savingAccount[k].checkBalance();
                    k++;
                    break;
                case 3:

                    account[i] = new Account();
                    System.out.println("Enter the amount you want to deposit: ");
                    account[i].deposit(input.nextDouble());
                    i++;
                    break;
                case 4:

                    account[i] = new Account();
                    System.out.println("Enter the amount you want to withdraw: ");
                    account[i].withdraw(input.nextDouble());
                    i++;
                    break;
                case 5:
                    curreAccount[j] = new CurrentAccount();
                    curreAccount[j].checkBalance();
                    savingAccount[j] = new SavingAccount();
                    savingAccount[k].checkBalance();
                    j++;
                    k++;

                    break;
                case 6:
                    System.out.println("Have a nice Day :)");
                    System.exit(0);

                default:
                    System.out.println("You entered wrong Choice.");
                    break;

            }
            System.out.println("Do you want to continue: ");
            option = input.next().charAt(0);
        } while (option == 'y');

    }

    public static void entries() {
        System.out.println("Enter your name: ");
        input.nextLine();
        accountTitle = input.nextLine();
        System.out.println("Enter you cnic: ");
        cnic = input.nextLine();
        System.out.println("Enter your Account Number: ");
        accountNumber = input.nextLong();
        System.out.println("Enter your balance: ");
        balance = input.nextDouble();

    }

    public static int display() {
        System.out.println("\nWelcome to Bank Account Menu\n");
        int choice;
        System.out.println("1. Add Current Account");
        System.out.println("2. Add Saving Account");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Check Balance");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        return choice;
    }
}