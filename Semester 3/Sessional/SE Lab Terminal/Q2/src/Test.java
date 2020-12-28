import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        int i = 1;
        while ((line = reader.readLine()) != null) {
            ArrayList<String> lStrings = new ArrayList<>();

            StringTokenizer stringTokenizer = new StringTokenizer(line, " ,");
            int count = 0;
            while (stringTokenizer.hasMoreTokens()) {
                lStrings.add(stringTokenizer.nextToken());
                count++;
            }
            writer.write((i) + ".\t" + (count) + "\t" + lStrings.get(0) + "..." + lStrings.get(count - 1) + "\n");
            System.out.println((i) + ".\t" + (count) + "\t" + lStrings.get(0) + "..." + lStrings.get(count - 1));
            i++;
        }

        writer.close();
        reader.close();

    }
}
