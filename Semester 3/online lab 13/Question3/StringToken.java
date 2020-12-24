import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

    public static void main(String[] args) {

        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        line = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        while (stringTokenizer.hasMoreTokens()) {

            String stringToken = stringTokenizer.nextToken();
            if (stringToken.charAt(0) == 'b' || stringToken.charAt(0) == 'B') {
                System.out.println(stringToken);
            }
        }
        input.close();
    }
}