import java.util.*;

public class BankAccount {

    private String name;
    private double balance;
    ArrayList<Double> transacAmount;
    private Random random = new Random();

    public BankAccount(String name) {

        this.name = name;
        this.balance = 500;
        this.transacAmount = new ArrayList<Double>();
        /*
         * for (int i = 0; i < 5; i++) { this.transacAmount.add(i, (1 +
         * random.nextDouble() * 500)); }
         */
    }

    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
        this.transacAmount = new ArrayList<Double>();
        /*
         * for (int i = 0; i < 5; i++) { this.transacAmount.add(i, (-1 +
         * random.nextDouble() * 500)); }
         */
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

    public double computeTransac() {
        double balance;
        double sum = 0;

        for (Double double1 : transacAmount) {
            sum += double1;
        }
        balance = this.balance - sum;
        return balance;
    }

    public void printCreditTransac() {
        for (int i = 0; i < transacAmount.size(); i++) {
            if (transacAmount.get(i) < 0) {
                System.out.println("Credit Card transac = " + transacAmount.get(i));
            }
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.transacAmount.remove(amount);
        }
    }

}
