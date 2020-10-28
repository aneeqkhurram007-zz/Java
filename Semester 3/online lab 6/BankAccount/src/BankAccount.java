import java.util.*;

public class BankAccount {

    private String name;
    private double balance;
    private ArrayList<Double> transacAmount = new ArrayList<Double>();
    private Random random = new Random();

    public BankAccount(String name) {

        this.name = name;
        this.balance = 500;

        for (int i = 0; i < 5; i++) {
            this.transacAmount.add(i, (1 + random.nextDouble() * 500));
        }
    }

    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
        for (int i = 0; i < 5; i++) {
            this.transacAmount.add(i, (-1 + random.nextDouble() * 500));
        }
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + this.balance);

    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.transacAmount.remove(0);
            this.transacAmount.add(amount);

        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.transacAmount.remove(amount);
        }
    }

}
