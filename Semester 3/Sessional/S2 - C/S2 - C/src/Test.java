import java.util.*;

public class Test {
    static int battery;
    static boolean camera;
    static String osVersion;
    static int price;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        int mobilePhone;
        OnlineStore onlineStore = new OnlineStore("Hafeez Centre");
        do {
            System.out.println("Press 1 for Android");
            System.out.println("Press 2 for Iphone");
            System.out.print("Enter your choice : ");
            mobilePhone = input.nextInt();
            switch (mobilePhone) {
                case 1:
                    setValues();
                    System.out.println("Enter ram value : ");
                    int ram = input.nextInt();
                    onlineStore.addPhone(battery, camera, osVersion, ram, price);
                    break;
                case 2:
                    setValues();
                    System.out.println("Enter audio jack value: ");
                    boolean audioJack = input.nextBoolean();
                    onlineStore.addPhone(battery, camera, osVersion, audioJack, price);
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to add mobile phone ?");
            input.nextLine();
            option = input.nextLine();
        } while (option.equals("y"));
        onlineStore.topThree();
        input.close();
    }

    public static void setValues() {
        System.out.println("Enter battery value : ");
        battery = input.nextInt();
        System.out.println("Enter camera value: ");
        camera = input.nextBoolean();
        System.out.println("Enter Os Version: ");
        input.nextLine();
        osVersion = input.nextLine();
        System.out.println("Enter price : ");
        price = input.nextInt();
    }
}
