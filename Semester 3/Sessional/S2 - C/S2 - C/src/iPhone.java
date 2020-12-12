public class iPhone extends MobilePhone {
    private boolean audioJack;

    public iPhone(int battery, boolean camera, String osVersion, boolean audioJack, int price) {
        super(battery, camera, osVersion, price);
        this.audioJack = audioJack;
    }

    @Override
    public void printInfo() {
        System.out.println("Battery : " + battery + "\nCamera : " + camera + "\nOS Version : " + osVersion
                + "\nAudio Jack : " + audioJack);
    }
}
