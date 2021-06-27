package Network.URL;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.net.URL;

public class URLConnectionExample2 {
    public static void main(String[] args) {
        URL url = null;
        out.println(url);

        String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
        out.println(address);

        BufferedReader bufferedReader = null;
        out.println(bufferedReader);
    }
}
