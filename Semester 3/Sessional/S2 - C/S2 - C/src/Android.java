public class Android extends MobilePhone {
    private int ram;

    public Android(int battery, boolean camera, String osVersion, int ram, int price) {
        super(battery, camera, osVersion, price);
        this.ram = ram;
    }

    @Override
    public void printInfo() {
        System.out.println("Battery : " + battery + "\nCamera : " + camera + "\nOS Version : " + osVersion + "\nRam : "
                + ram + "\nPrice : " + price);
    }
}
