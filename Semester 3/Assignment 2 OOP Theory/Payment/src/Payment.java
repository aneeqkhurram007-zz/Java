public class Payment {
    private double payment;

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void paymentDetails() {
        System.out.println("Current amount in your account: " + getPayment());
    }

}
