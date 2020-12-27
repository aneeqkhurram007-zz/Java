import java.io.*;
// import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fStream;
        FileOutputStream fout;

        try {
            fout = new FileOutputStream("data.txt");
            String name = "1 2 3 4 5";
            char[] ch = name.toCharArray();
            for (int i = 0; i < name.length(); i++) {
                fout.write(ch[i]);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fStream = new FileInputStream("data.txt");
            int i;
            do {
                i = fStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
            System.out.println();
            fStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}