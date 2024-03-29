public class CurrentAccount extends Account {
    private static double serviceFee;

    private static int count = 0;

    public double getServiceFee() {
        return serviceFee;
    }

    public static void setServiceFee(double Fee) {
        do {
            if (Fee >= 0) {
                serviceFee = Fee;
                break;
            } else {
                System.out.print("You entered invalid service fee. Try Again: ");
                Fee = input.nextDouble();
            }
        } while (true);
    }

    public int totalAccounts() {
        return count;
    }

    public CurrentAccount() {

        ++count;
    }

    public CurrentAccount(String cnic, long accountNumber, String accountTitle, double balance) {

        System.out.println("Data for Current Account");
        setAccountTitle(accountTitle);
        setCnic(cnic);
        setAccountNumber(accountNumber);
        setBalance(balance);

        System.out.println("\nCurrent Account Created\n");
        ++count;
    }

    public void deposit(double balance) {
        setBalance(getBalance() + balance);
    }

    public void withdraw(double balance) {
        setBalance(getBalance() - balance);
    }

    public void addAccount(String cnic, String accountTitle, double balance, long accountNumber, double serviceFee) {
        super.addAccount(cnic, accountTitle, balance);

        setAccountNumber(accountNumber);

        setServiceFee(serviceFee);

    }

    public void checkBalance() {
        System.out.println("Your current balance is = " + this.getBalance());
    }
}
