package Stream;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
import java.util.List;
// import java.util.Random;
import java.util.Scanner;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;

import static java.lang.System.out;

public class TestStream {
    public static List<Integer> calculator(int numberLength) {
        List<Integer> list = new ArrayList<>();
        // int[] array = new int[numberLength];
        for (int i = 0; i < numberLength; i++) {
            list.add((int) (Math.random() * (50 - 10 + 1) + 10));
        }
        // IntStream stream = Arrays.stream(array);
        // IntStream intStream = new Random(numberLength);
        // list.stream().forEach(getValue -> list.add((int) (Math.random() * (50 - 10 +
        // 1)) + 10));

        return list;
    }

    public static String printResult(List<Integer> getCalculateArray) {
        String result = "";

        getCalculateArray.stream().forEach(string -> out.print(string + " "));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("숫자 입력 : ");

        int userInputLength = sc.nextInt();

        List<Integer> calculateArray = calculator(userInputLength);
        // out.println(calculateArray);

        String result = printResult(calculateArray);
        out.println(result);

        sc.close();
    }
}
