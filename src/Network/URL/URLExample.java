package Network.URL;

import static java.lang.System.out;

import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            out.println("No URL");
            URL url = null;
            out.println(url);

            out.println();
            out.println("-----------------------------------------");
            out.println("Has URL");

            url = new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
            out.println(url);

            out.println();
            out.println("-----------------------------------------");
            out.println("Show URL Info");

            out.println("Authority : " + url.getAuthority());
            out.println("Content : " + url.getContent());
            out.println("Protocal : " + url.getProtocol());
            out.println("Host : " + url.getHost());
            out.println("Port : " + url.getPort());
            out.println("Path : " + url.getPath());
            out.println("File : " + url.getFile());
            out.println("Query : " + url.getQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
