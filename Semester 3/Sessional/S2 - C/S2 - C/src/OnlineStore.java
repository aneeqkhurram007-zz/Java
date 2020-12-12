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

    }

    public void addPhone(int battery, boolean camera, String osVersion, boolean audioJack, int price) {
        track++;
        if (track < 10) {
            mobilePhones.add(new iPhone(battery, camera, osVersion, audioJack, price));
        }
    }

    public void topThree() {

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        int index1 = 0;
        int index2 = 0;

        for (int j = 0; j < track; j++) {
            if (max1 < mobilePhones.get(j).price) {
                max1 = mobilePhones.get(j).price;
                index1 = j;
            }
        }
        for (int i = 0; i < track; i++) {
            if (i == index1) {
                continue;
            } else {
                if (max2 < mobilePhones.get(i).price) {
                    max2 = mobilePhones.get(i).price;
                    index2 = i;
                }
            }
        }
        for (int i = 0; i < track; i++) {
            if (i == index2 || i == index1) {
                continue;
            } else {
                if (max3 < mobilePhones.get(i).price) {
                    max3 = mobilePhones.get(i).price;
                }
            }
        }
        System.out.println("TOP 1 = " + max1);
        System.out.println("TOP 2 = " + max2);
        System.out.println("TOP 3 = " + max3);

    }
}
