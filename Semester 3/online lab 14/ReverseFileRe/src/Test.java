import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        FileWriter writer = new FileWriter("output.txt", true);
        writer.write("Aneeq Khurram");
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

        BufferedInputStream r = new BufferedInputStream(new FileInputStream("output.txt"));
        int i;
        while ((i = reader.read()) != -1) {
            char c = (char) i;
            System.out.print(c);
        }
        writer.write("1 2 3 4 5");
        writer.close();
        r.close();
        reader.close();
    }
}
