import java.util.ArrayList;

public class OnlineStore {
    private static String onlineStore;
    private static int track = 0;
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

    }

    public void addPhone(int battery, boolean camera, String osVersion, boolean audioJack, int price) {
        track++;
        if (track < 10) {
            mobilePhones.add(new iPhone(battery, camera, osVersion, audioJack, price));
        }
    }

    public void topThree() {
        for (MobilePhone mobilePhone : mobilePhones) {
            System.out.println("Original Price = " + mobilePhone.price);
        }
        MobilePhone mtemp;
        for (int i = 0; i < track; i++) {
            for (int j = i; j < track; j++) {
                if (mobilePhones.get(i).price < mobilePhones.get(j).price) {
                    mtemp = mobilePhones.get(i);
                    mobilePhones.set(i, mobilePhones.get(j));
                    mobilePhones.set(j, mtemp);
                }
            }
            System.out.println("\tTop # " + (i + 1));
            mobilePhones.get(i).printInfo();
        }

    }
}
