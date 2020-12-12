import java.util.*;

public class Test {
    static int battery;
    static boolean camera;
    static String osVersion;
    static int price;
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String option;
        int mobilePhone;
        int count = 1;
        OnlineStore onlineStore = new OnlineStore("Hafeez Centre");
        if (count <= 10) {

            do {
                System.out.println("Press 1 for Android");
                System.out.println("Press 2 for Iphone");
                System.out.print("Enter your choice : ");
                mobilePhone = input.nextInt();
                switch (mobilePhone) {
                    case 1:
                        setValues();
                        // System.out.println("Enter ram value : ");
                        int ram = random.nextInt(8);
                        onlineStore.addPhone(battery, camera, osVersion, ram, price);
                        break;
                    case 2:
                        setValues();
                        // System.out.println("Enter audio jack value: ");
                        boolean audioJack = random.nextBoolean();
                        onlineStore.addPhone(battery, camera, osVersion, audioJack, price);
                        break;
                    default:
                        break;
                }

                System.out.println("Do you want to add mobile phone ?");
                input.nextLine();
                option = input.nextLine();
                ++count;
            } while (option.equals("y"));
            onlineStore.topThree();
        } else {
            System.out.println("Cannot Add more than 10 mobile phones.");
        }
        input.close();

    }

    public static void setValues() {
        // System.out.println("Enter battery value : ");
        battery = random.nextInt(50);
        // System.out.println("Enter camera value: ");
        camera = random.nextBoolean();
        // System.out.println("Enter Os Version: ");
        // input.nextLine();
        osVersion = "Operating System";
        // System.out.println("Enter price : ");
        price = random.nextInt(1000);
    }
}
