import static java.lang.System.out;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
    public static Scanner readFile(String fileName) {
        Scanner fileReader = null;
        File file = new File(fileName);

        try {
            fileReader = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileReader;
    }

    public static void writeFile(String fileName, String result) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getStudentData() {
        String result = "";
        return result;
    }

    public static void main(String[] args) {
        Student student = new Student();
        out.println(student.getAge());
        out.println(student.getName());
        out.println(student.getStudentNumber());
    }
}
