public class Apartment extends Building {
    private double ApartmentMainteneceBill;
    private Lift lift;

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

    public void input(String houseNum, String resName, int paymentMonth, boolean paidStatus, String houseType,
            Lift lift) {
        super.input(houseNum, resName, paymentMonth, paidStatus, houseType);
        this.lift = lift;
    }

    @Override
    public void saveInformation(Building b) throws Exception {
        super.saveInformation(b);
    }

    @Override
    public void searchInformation(String HouseNum, Building b) {
        super.searchInformation(HouseNum, b);
    }
}
