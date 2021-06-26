package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static java.lang.System.out;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            out.println("접속하고자 하는 사이트의 IP 주소");
            InetAddress ip = InetAddress.getByName("www.google.co.kr");
            out.println(ip);

            out.println("Host-Name : " + ip.getHostName());
            out.println("IP : " + ip.getHostAddress());

            out.println();
            out.println("-----------------------------------------");
            out.println();

            out.println("내 컴퓨터의 IP 주소");

            InetAddress getCurrentIPAddress = InetAddress.getLocalHost();
            out.println("Host-Name : " + getCurrentIPAddress.getHostName());
            out.println("IP : " + getCurrentIPAddress.getHostAddress());

            out.println();
        } catch (UnknownHostException e) {
            out.println("알 수 없는 호스트입니다.");
            out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
