import java.util.*;

public class Account {
    protected String cnic;
    protected long accountNumber;
    protected String accountTitle;
    protected double balance;
    private Scanner input = new Scanner(System.in);
    private int count;

    public Account() {
        this.accountTitle = "Aneeq";
        this.cnic = "35201";
        this.accountNumber = 56789;
        this.balance = 500;

        count++;
    }

    public void addAccount(String accountTitle, String cnic, long accountNumber, double balance) {
        this.accountTitle = accountTitle;
        this.cnic = cnic;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = (amount > 0) ? (this.balance += amount) : (this.balance);
        System.out.println("Now your current balance is " + this.balance);
    }

    public void withdraw(double amount) {
        while (amount > balance) {
            System.err.println("Try Again. You do not have much amount in your account.");
            amount = input.nextDouble();
        }
        this.balance -= amount;
        System.out.println("Now your current balance is " + this.balance);

    }

    public int totalAccounts() {
        return count;
    }
}
