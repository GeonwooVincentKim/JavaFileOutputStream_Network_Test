package Network.URL;

import java.net.URL;
import java.net.URLConnection;

import static java.lang.System.out;

public class URLConnectionExample {
    public static void main(String[] args) {
        out.println("비어있는 URL");

        URL url = null;
        out.println(url);

        out.println();
        out.println("--------------------------------");
        out.println("URL 주소");

        String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=18&submenu=1";
        out.println(address);

        out.println();
        out.println("--------------------------------");
        out.println("URL 주소");

        try {
            url = new URL(address);
            out.println(url);

            out.println();
            out.println("--------------------------------");
            out.println("URLConnection 정보");

            URLConnection conn = url.openConnection();
            out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
