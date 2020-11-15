import java.util.*;

public class AccountTest {

    static String accountTitle;
    static String cnic;
    static long accountNumber;
    static double balance;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, i = 0, j = 0, k = 0;
        char option;
        double amount;

        Account[] accounts = new Account[5];
        CurrentAccount[] currentAcc = new CurrentAccount[5];
        SavingAccount[] savingAcc = new SavingAccount[5];

        do {
            mainMenu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    currentAcc[j] = new CurrentAccount();

                    entries();
                    currentAcc[j].addAccount(accountTitle, cnic, accountNumber, balance);
                    System.out.println("Account has been created successfully.");
                    j++;
                    break;
                case 2:
                    savingAcc[k] = new SavingAccount();

                    entries();
                    savingAcc[k].addAccount(accountTitle, cnic, accountNumber, balance);
                    System.out.println("Account has been created successfully.");
                    k++;
                    break;
                case 3:
                    accounts[i] = new Account();

                    System.out.println("Amount you want to deposit.");
                    amount = input.nextDouble();
                    accounts[i].deposit(amount);
                    i++;

                    break;
                case 4:
                    accounts[i] = new Account();

                    System.out.println("Amount you want to withdraw.");
                    amount = input.nextDouble();
                    accounts[i].withdraw(amount);
                    i++;

                    break;
                case 5:
                    currentAcc[j] = new CurrentAccount();
                    currentAcc[j].checkBalance();
                    j++;

                    savingAcc[k] = new SavingAccount();
                    savingAcc[k].checkBalance();
                    k++;

                    break;
                case 6:
                    System.out.println("Have a nice day :)");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Invalid Choice");
                    break;
            }

            System.out.print("Do you want to continue: ");
            option = input.next().charAt(0);
        } while (option == 'y');

        input.close();
    }

    public static void mainMenu() {
        System.out.println("1. Add Current Account");
        System.out.println("2. Add Saving Account");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Check Balance");
        System.out.println("6. Exit");
    }

    public static void entries() {
        System.out.print("Enter your Account Title: ");
        input.nextLine();
        accountTitle = input.nextLine();

        System.out.print("Enter your cnic: ");
        cnic = input.nextLine();

        System.out.print("Enter your Account Number: ");
        accountNumber = input.nextLong();

        System.out.print("Enter your balance: ");
        balance = input.nextDouble();

    }
}
