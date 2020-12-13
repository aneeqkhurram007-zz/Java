import java.io.*;

public class Test {
    static int battery;
    static boolean camera;
    static String osVersion;
    static int price;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String option;
        int mobilePhone;
        int count = 1;
        OnlineStore onlineStore = new OnlineStore("Hafeez Centre");
        if (count <= 10) {

            do {
                System.out.println("Press 1 for Android");
                System.out.println("Press 2 for Iphone");

                System.out.print("Enter your choice : ");
                mobilePhone = Integer.parseInt(input.readLine());

                System.out.println("\n\tPhone Specifications for Mobile: " + count + "\n");

                switch (mobilePhone) {
                    case 1:
                        setValues();

                        System.out.println("Enter ram value : ");
                        int ram = Integer.parseInt(input.readLine());

                        onlineStore.addPhone(battery, camera, osVersion, ram, price);
                        break;
                    case 2:
                        setValues();

                        System.out.println("Enter audio jack value: ");
                        boolean audioJack = Boolean.parseBoolean(input.readLine());

                        onlineStore.addPhone(battery, camera, osVersion, audioJack, price);
                        break;
                    default:
                        break;
                }

                System.out.println("Do you want to add mobile phone ?");
                option = input.readLine();
                ++count;
            } while (option.equals("y"));

            onlineStore.topThree();

        } else {
            System.out.println("Cannot Add more than 10 mobile phones.");
        }
        input.close();

    }

    public static void setValues() throws IOException {
        System.out.println("Enter price : ");
        price = Integer.parseInt(input.readLine());

        System.out.println("Enter battery value : ");
        battery = Integer.parseInt(input.readLine());

        System.out.println("Enter camera value: ");
        camera = Boolean.parseBoolean(input.readLine());

        System.out.println("Enter Os Version: ");
        osVersion = input.readLine();
    }
}
