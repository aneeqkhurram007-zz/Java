public abstract class MobilePhone {
    protected int battery;
    protected boolean camera;
    protected String osVersion;
    protected int price;

    public abstract void printInfo();

    public MobilePhone(int battery, boolean camera, String osVersion, int price) {
        this.battery = battery;
        this.camera = camera;
        this.price = price;
        this.osVersion = osVersion;
    }
}
