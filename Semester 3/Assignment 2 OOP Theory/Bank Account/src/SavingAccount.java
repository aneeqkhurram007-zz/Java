public class SavingAccount extends Account {
    private double monthlyInterestRate;
    private long accountNumber;
    private static int count = 0;

    public void addAccount(String cnic, String accountTitle, double balance, long accountNumber,
            double monthlyInterestRate) {
        super.addAccount(cnic, accountTitle, balance);

        setAccountNumber(accountNumber);

        setMonthlyInterestRate(monthlyInterestRate);

    }

    public void setAccountNumber(long accountNumber) {
        do {
            if (checkAccountNumber(accountNumber) == true) {
                this.accountNumber = accountNumber;
                break;
            } else {
                System.out.print("\nTry Again! You entered wrong account Number\nFirst digit should be 2: ");
                accountNumber = input.nextLong();

            }
        } while (true);
    }

    public static boolean checkAccountNumber(long accountNumber) {
        String s = String.valueOf(accountNumber);
        return s.charAt(0) == '2';
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        do {
            if (monthlyInterestRate >= 0) {
                this.monthlyInterestRate = monthlyInterestRate;
                break;
            } else {
                System.out.print("You entered invalid monthly interest. Try Again: ");
                monthlyInterestRate = input.nextDouble();
            }
        } while (true);
    }

    public int totalAccounts() {
        return count;
    }

    public SavingAccount() {
        setAccountTitle("Aneeq");
        setCnic("35201");
        setAccountNumber(2345);
        setBalance(700);
        ++count;
    }

    public SavingAccount(String cnic, long accountNumber, String accountTitle, double balance) {
        System.out.println("Enter Data for Saving Accounts");

        setAccountTitle(accountTitle);
        setCnic(cnic);
        setAccountNumber(accountNumber);
        setBalance(balance);
        System.out.println("\nSaving Account Created\n");
        ++count;
    }

    public void deposit(double balance) {
        setBalance(getBalance() + balance);
    }

    public void withdraw(double balance) {
        setBalance(getBalance() - balance);
    }

    public void checkBalance() {
        System.out.println("Your saved balance is = " + this.getBalance());
    }

    public double caclulateInterestRate() {
        double caclulateInterestRate = this.monthlyInterestRate / 100;
        setBalance(getBalance() + caclulateInterestRate);
        return getBalance();
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
