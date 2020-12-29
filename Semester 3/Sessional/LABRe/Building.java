import java.io.*;

public class Building {
    private String HouseNum;
    public String Res_name;
    private boolean isPaid;
    public int billingMonth;
    public String HouseType;

    public void input(String houseNum, String resName, int paymentMonth, boolean paidStatus, String houseType) {

        HouseNum = houseNum;
        Res_name = resName;
        billingMonth = paymentMonth;
        isPaid = paidStatus;
        HouseType = houseType;

    }

    public void searc(String HouseNum, Building b) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
        while (bufferedReader.read() != -1) {
            String s;
            s = bufferedReader.readLine();
            if (s.equals(HouseNum)) {
                System.out.println(b);
            }

        }

    }

    public void setNum(String num) {
        this.HouseNum = num;
    }

    public String getNum() {
        return this.HouseNum;
    }

    public void setbill(double bill) {
        this.billingMonth = (int) bill;
    }

    public double getbill() {
        return this.billingMonth;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }

    public boolean getPaid() {
        return this.isPaid;
    }

    public double calculateTotalBill(int numOfBuildings, int month) {
        return numOfBuildings * month;
    }
}