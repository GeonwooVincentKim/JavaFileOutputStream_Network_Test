package FileOutputStream;

import static java.lang.System.out;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test2.txt", true);
            out.println(fileOutputStream);

            byte[] b = new byte[26]; // Bring the Alphabet as number of alphabet
            byte data = 65;

            for (int i = 0; i < b.length; i++) {
                b[i] = data;
                data++;
            }

            fileOutputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
