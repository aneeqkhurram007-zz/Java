import java.util.ArrayList;

public class OnlineStore {
    private static String onlineStore;
    private static int track = 0;
    // private static MobilePhone[] mobilePhones = new MobilePhone[10];
    private static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public OnlineStore(String OnlineStore) {
        onlineStore = OnlineStore;
    }

    public String getOnlineStore() {
        return onlineStore;
    }

    public void addPhone(int battery, boolean camera, String osVersion, int ram, int price) {
        track++;
        if (track < 10) {
            mobilePhones.add(new Android(battery, camera, osVersion, ram, price));
        }
        // mobilePhones[index] = new Android(battery, camera, osVersion, ram, price);

    }

    public void addPhone(int battery, boolean camera, String osVersion, boolean audioJack, int price) {
        track++;
        if (track < 10) {
            mobilePhones.add(new iPhone(battery, camera, osVersion, audioJack, price));
        }
        // mobilePhones[index] = new iPhone(battery, camera, osVersion, audioJack,
        // price);
    }

    public void topThree() {

        for (int i = 0; i < track; i++) {
            System.out.println("Mobile Phone " + (i + 1));
            mobilePhones.get(i).printInfo();
        }
    }
}
