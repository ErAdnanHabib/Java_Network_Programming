import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class printNtwkAdapters{

    public static void main(String[] args) {
        
        try{
            Enumeration<NetworkInterface> networkIn = NetworkInterface.getNetworkInterfaces();
            System.out.println("Network Display: \n");
            
            for(NetworkInterface element : Collections.list(networkIn)){
                System.out.printf("%-8s %-32s \n",element.getName(),element.getDisplayName());
            }

        }catch(SocketException e){
            e.printStackTrace();
        }
    }

}