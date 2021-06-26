package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true);
            out.println(fileOutputStream);

            fileOutputStream.write(68);
            fileOutputStream.write(69);
            fileOutputStream.write(70);
        } catch (IOException e) {
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
