import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class telephone {

    public static void main(String[] args) {
        String phoneNumber;
        Scanner input = new Scanner(System.in);
        Pattern pattern;
        Matcher matcher;

        do {
            System.out.print("Enter a Phone Number (XXX)XXXX-XXX: ");
            phoneNumber = input.nextLine();
            pattern = Pattern.compile("^[(][0-9]{3}[)][0-9]{4}[-][0-9]{3}$");
            matcher = pattern.matcher(phoneNumber);
        } while (!matcher.find());
        System.out.println("Phone Number = " + phoneNumber);
        StringTokenizer stringTokenizer = new StringTokenizer(phoneNumber, "()-");
        String areaCode = stringTokenizer.nextToken();
        String phoneString = stringTokenizer.nextToken();
        while (stringTokenizer.hasMoreTokens()) {
            phoneString = phoneString.concat(stringTokenizer.nextToken());
        }
        System.out.println("Area Code = " + areaCode);
        System.out.println("Phone Number = " + phoneString);
        input.close();
    }
}