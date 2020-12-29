import java.io.*;
import java.util.Scanner;

public class Building {
    private String HouseNum;
    public String Res_name;
    private boolean isPaid;
    public int billingMonth;
    public String HouseType;

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
        return numOfBuildings * 1500;
    }

    public void input(String houseNum, String resName, int paymentMonth, boolean paidStatus, String houseType) {

        this.HouseNum = houseNum;
        this.Res_name = resName;
        this.billingMonth = paymentMonth;
        this.isPaid = paidStatus;
        this.HouseType = houseType;

    }

    public void saveInformation(Building b) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
        writer.write("House#  ResName  Month  PaidStatus  HouseType");
        writer.newLine();
        writer.write(b.toString());
        writer.newLine();
        writer.close();
    }

    public void searchInformation(String HouseNum, Building b) {
        try {
            Scanner reader = new Scanner(new FileReader("data.txt"));
            while (reader.hasNext()) {
                String sub = reader.next();

                if (sub.equals(HouseNum)) {
                    System.out.print(sub);
                    System.out.println(reader.nextLine());

                }
            }
            System.out.println("No more records found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.HouseNum + "\t" + this.Res_name + "\t" + this.billingMonth + "\t\t" + this.isPaid + "\t\t"
                + this.HouseType;
    }
}
