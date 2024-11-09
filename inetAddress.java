import java.net.*;
public class inetAddress {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress names[] = InetAddress.getAllByName("google.com");

        for(InetAddress name : names){
            System.out.println(name);
        }
        
        System.out.println("--------------------------------------------");

        InetAddress myAddress = InetAddress.getByName("Google.com");

        if(myAddress.isAnyLocalAddress()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
