package Stream;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpeedStream {
    public static String[] getArrays(int length) {
        String[] arrays = new String[length];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextLine();
        }

        sc.close();
        return arrays;
    }

    public static List<String> convertArrayToList(String[] arrays) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            list.add(arrays[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        int length = 4;

        // String[] arrays = new String[length];
        String[] arrays = getArrays(length);
        out.println(arrays);

        // List<String> list = new ArrayList<>();
        List<String> list = convertArrayToList(arrays);
        out.println(list);

        int listSize = list.size();
        long start = System.currentTimeMillis();

        for (int i = 0; i < listSize; i++) {
            out.println(list);
        }

        long end = System.currentTimeMillis();
        out.println((end - start) + "ms");

        Iterator<String> it = list.iterator();
        out.println(it);
    }
}
