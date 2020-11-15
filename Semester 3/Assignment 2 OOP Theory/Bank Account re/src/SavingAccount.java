import java.util.*;

public class SavingAccount extends Account {
    private float monthlyInterestRate;
    private int count;
    private Scanner input = new Scanner(System.in);

    public SavingAccount() {
        System.out.println("Saving Account");
        count++;
    }

    @Override
    public void addAccount(String accountTitle, String cnic, long accountNumber, double balance) {

        // Validation for Account Title
        while (!(accountTitle.matches("^[a-zA-Z]*$"))) {
            System.err.println("Try Again. Name can have only alphabets.");
            accountTitle = input.nextLine();
            if (!(accountTitle.charAt(0) >= 65 && accountTitle.charAt(0) <= 90)) {
                System.err.println("First Letter should be capital.");
                accountTitle = input.nextLine();
            }

        }
        this.accountTitle = accountTitle;
        // Validation for Cnic
        while (!cnic.matches("[0-9]+")) {
            System.err.println("Try Again. Cnic must be a number.");
            cnic = input.nextLine();
        }
        this.cnic = cnic;

        // Validation for accountNumber
        String accNum = Long.toString(accountNumber);
        while (accNum.charAt(0) != '2') {
            System.err.println("Try Again. Make sure first digit is 2.");
            accountNumber = input.nextLong();
            accNum = Long.toString(accountNumber);
        }
        this.accountNumber = accountNumber;

        // Validation for Balance
        while (balance <= 0) {
            System.err.println("Try Again. Service Fee must be greater than 0.");
            balance = input.nextDouble();
        }
        this.balance = balance;

    }

    public void setInterestRate(float rate) {
        while (rate < 1) {
            System.err.println("Try Again. Service Fee is less than 0");
            rate = input.nextFloat();
        }
        monthlyInterestRate = rate;

    }

    public double calculateInterestRate() {
        return this.balance += (monthlyInterestRate / 100);
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + this.balance);
    }

    @Override
    public int totalAccounts() {
        return count;
    }

}
