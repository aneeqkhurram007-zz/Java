import java.io.*;

public class Apartment extends Building {
    private double ApartmentMainteneceBill;

    public void searc(String HouseNum, Building b) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("source.txt"));
        while (bufferedReader.read() != -1) {
            String s;
            s = bufferedReader.readLine();
            if (s.equals(HouseNum)) {
                System.out.println(b);
            }

        }

    }

    public void setbill(double bill) {
        this.billingMonth = (int) bill;
    }

    public double getbill() {
        return this.billingMonth;
    }

    public double calculateBill(int numOfBuildings, int month) {
        return numOfBuildings * month;
    }
}
