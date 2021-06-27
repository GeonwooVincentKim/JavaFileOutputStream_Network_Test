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
            out.println("conn.toString() : " + conn);

            out.println();

            out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
            out.println("getConnectTimeout() : " + conn.getConnectTimeout());
            out.println("getContent() : " + conn.getContent());
            out.println("getContentEncoding() : " + conn.getContentEncoding());
            out.println("getContentLength() : " + conn.getContentLength());
            out.println("getContentType() : " + conn.getContentType());

            out.println();

            out.println("getDate() : " + conn.getDate());
            // out.println("getDefaultAllowUserInteraction() : " +
            // conn.getDefaultAllowUserInteraction());
            out.println("getDefaultAllowUserInteraction() : " + URLConnection.getDefaultAllowUserInteraction());
            out.println("getDefaultUseCaches() : " + conn.getDefaultUseCaches());
            out.println("getDoInput() : " + conn.getDoInput());

            out.println();

            out.println("getExpiration() : " + conn.getExpiration());
            out.println("getHeaderFields() : " + conn.getHeaderFields());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
