import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverse {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Aneeq Khurram");
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));

        ArrayList<Character> characters = new ArrayList<>();
        int i, count = 0;
        System.out.println("Correct Order");
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

        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("Reverse Order");
        while (it.hasNext()) {
            Character ch = it.next();
            bufferedWriter.write(String.valueOf(ch));
            System.out.println(ch);
        }
        printWriter.close();

    }

}
