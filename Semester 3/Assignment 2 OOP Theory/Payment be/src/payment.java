public class payment {

    protected double payment;

    public payment() {

    }

    public void paymentDetails() {
        System.out.println("Current payment: " + this.payment);
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

}
