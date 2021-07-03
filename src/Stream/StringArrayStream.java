package Stream;

import static java.lang.System.out;

import java.util.stream.Stream;

public class StringArrayStream {
    public static void main(String[] args) {
        String[] arr = new String[] { "a", "b", "c", "d", "e" };
        out.println(arr);

        Stream<String> streamString = Stream.of(arr);
        streamString.forEach(s -> out.println(s));
    }
}
