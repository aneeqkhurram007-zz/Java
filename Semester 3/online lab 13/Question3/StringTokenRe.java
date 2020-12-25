import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenRe {
    public static void main(String[] args) {
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        line = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
        while (stringTokenizer.hasMoreTokens()){
            String tokenString=stringTokenizer.nextToken();
            if (tokenString.charAt(0)=='b')
            {
                System.out.println(tokenString);
            }
        }
    }
}
