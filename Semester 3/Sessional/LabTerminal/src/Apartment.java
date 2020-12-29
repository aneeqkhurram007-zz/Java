public class Apartment extends Building {
    private double ApartmentMainteneceBill;

    @Override
    public void setbill(double bill) {
        this.ApartmentMainteneceBill = bill;
    }

    @Override
    public double getbill() {
        return this.ApartmentMainteneceBill;
    }

    @Override
    public double calculateTotalBill(int numOfBuildings, int month) {
        return calculateTotalBill(numOfBuildings, month);
    }

    @Override
    public void input(String houseNum, String resName, int paymentMonth, boolean paidStatus, String houseType) {
        super.input(houseNum, resName, paymentMonth, paidStatus, houseType);
    }

    @Override
    public void saveInformation(Building b) throws Exception {
        super.saveInformation(b);
    }
}
