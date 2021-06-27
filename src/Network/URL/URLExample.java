package Network.URL;

import static java.lang.System.out;

import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = null;
            out.println(url);

            url = new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
            out.println(url);

            out.println("Authority : " + url.getAuthority());
            out.println("Content : " + url.getContent());
            out.println("Protocal : " + url.getProtocol());
            out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
