
import java.io.IOException;
import java.net.InetAddress;


public class getting_IP_from_domain{

    public static void main(String[] args) throws IOException {

        InetAddress insta = InetAddress.getByName("www.instagram.com");

        System.out.println("Host Address: " + insta.getHostAddress());
        System.out.println("canonical host address: " + insta.getCanonicalHostName());
        System.out.println("host name: " + insta.getHostName());
        insta.isReachable(10000);
        
    }
}