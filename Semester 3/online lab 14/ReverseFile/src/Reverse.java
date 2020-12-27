import java.io.*;
import java.util.ArrayList;

public class Reverse {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("1 2 3 4 5 6");
        bufferedWriter.close();
        FileReader fileReader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<Integer> integers = new ArrayList<>();
        int i, count = 0;
        do {
            i = bufferedReader.read();
            if (i != -1) {
                char c = (char) i;
                // integers.add(Character.getNumericValue(c));
                integers.add(i);
                System.out.println(integers.get(count));
                count++;
            }
        } while (i != -1);
        bufferedReader.close();
    }

}
