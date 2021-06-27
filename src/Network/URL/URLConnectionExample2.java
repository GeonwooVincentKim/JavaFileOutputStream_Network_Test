package Network.URL;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionExample2 {
    public static void main(String[] args) {
        out.println("비어있는 URL");

        URL url = null;
        out.println(url);

        out.println();
        out.println("--------------------------------");
        out.println("URL 주소");

        String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
        out.println(address);

        out.println("비워진 BufferedReader 값들");

        BufferedReader bufferedReader = null;
        out.println(bufferedReader);

        String readLine = "";
        // out.println(readLine);

        out.println();
        out.println("--------------------------------");
        out.println("URL 주소");

        try {
            url = new URL(address);
            out.println(url);

            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            out.println(bufferedReader);

            while ((readLine = bufferedReader.readLine()) != null) {
                out.println(readLine);
            }
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("---------------------");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
            }
        }
    }
}
