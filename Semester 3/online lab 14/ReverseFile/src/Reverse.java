import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverse {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));

        bufferedWriter.write("6 5 4 3 2 1");
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));

        ArrayList<Character> characters = new ArrayList<>();
        int i, count = 0;

        do {
            i = bufferedReader.read();
            if (i != -1) {
                char c = (char) i;
                characters.add(c);
                System.out.println(characters.get(count));
                count++;
            }
        } while (i != -1);

        bufferedReader.close();

        Collections.reverse(characters);
        Iterator<Character> it = characters.iterator();

        PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt"));

        while (it.hasNext()) {
            Character ch = it.next();
            printWriter.write(String.valueOf(ch));
            System.out.println(ch);
        }
        printWriter.flush();
        printWriter.close();
    }

}
