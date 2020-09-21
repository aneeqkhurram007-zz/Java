
/**
 * first
 */
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        // Microphone
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        System.out.println("This value of y = " + y);

        Microphone microphone = new Microphone("Blue Yeti", "Blue", 35844);
        // microphone.name = "Blue Beti";
        // microphone.color = "Blue";
        // microphone.setModel(87);
        microphone.setName("New Blue Yeti");
        microphone.setColor("Red-Blue");

        System.out.println("New Mic:" + microphone.getName());

        // System.out.println(microphone.name);

        Microphone gwmicro = new Microphone("gwmic", "Red", 45648);
        // gwmicro.name = "ANeeq";
        // gwmicro.model = 848445;
        // gwmicro.color = "Red";
        // System.out.println(gwmicro.color);

        // microphone
        microphone.setVolume();
        microphone.turnoff();
        microphone.turnon();

        // gwmic
        gwmicro.turnoff();
        gwmicro.turnon();
        gwmicro.setVolume();
        // show Description
        System.out.println(microphone.showDescription());
        System.out.println(gwmicro.showDescription());

        // murshad
        murshad(12, 25);
        x.close();
    }

    private static void murshad(int a, int b) {
        System.out.println("The result is " + (a + b));
    }

}