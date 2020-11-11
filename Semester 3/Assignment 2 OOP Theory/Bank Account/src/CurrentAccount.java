public class CurrentAccount extends Account {
    private double serviceFee;
    private static int count = 0;

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public double checkBalance() {

        return this.getBalance();

    }

    public CurrentAccount() {
        System.out.println("Current Account Created");
        ++count;
    }

    public void addAccount(String cnic, String accountTitle, double balance, long accountNumber, double serviceFee) {
        super.addAccount(cnic, accountTitle, balance);
        this.setServiceFee(serviceFee);
        this.setAccountNumber(accountNumber);

    }
}
