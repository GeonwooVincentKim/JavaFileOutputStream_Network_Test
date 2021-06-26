import static java.lang.System.out;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        // out.println("Test");
        Scanner sc = new Scanner(System.in);

        int getUserInput = sc.nextInt();
        int[] storeResultValue = new int[getUserInput];
        out.println(storeResultValue.length);
        int sum = 0;

        for (int i = 0; i < storeResultValue.length; i++) {
            storeResultValue[i] = i;
        }

        for (int i = 0; i < storeResultValue.length; i++) {
            sum = sum + storeResultValue[i];
            out.println(sum);
        }

        // sum = getSumValue(storeResultValue);

        out.println(sum);
        sc.close();
    }

    public static int getSumValue(int[] storeResultValue) {
        int sum = 0;

        // int[] storeResultValue = new int[getUserInput];
        for (int i = 0; i < storeResultValue.length; i++) {
            sum += storeResultValue[i];
            out.println(sum);
        }

        return sum;
    }
}
