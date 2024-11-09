import java.io.*;
import java.net.*;
import java.util.*;

public class clientSide {

    private static InetAddress host;
    private static final int PORT = 1234;


    public static void main(String[] args) {
        try{
            host = InetAddress.getLocalHost();
        } catch(UnknownHostException e){

            System.out.println("ERROR CAUSED : " + e.getMessage());
            System.exit(1);

        }
        accessServer();
    }

    private static void accessServer(){

        Socket link = new Socket();

        try{
            link = new Socket(host,PORT); 
            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(),true);

            Scanner userEntry = new Scanner(System.in);
            String message , response;
            do{
                System.out.println("ENTER NEW MESSAGE...: ");
                message = userEntry.nextLine();
                output.println(message);
                response = input.nextLine();
                System.out.println("\n SERVER > " + response);
                System.out.println("{{{message sent successfully......}}} ");
            }while(!message.equals("***CLOSE***"));
        }catch(IOException e){
            e.printStackTrace();

        }

        finally{
            try { 
                System.out.println(" \n CLOSING CONNECTION...* ");
                link.close();
            } catch (IOException e) {
                System.out.println("UNABLE TO DISCONNECT ! ERROR :  " + e.getMessage());
                System.exit(1);
            }
        }
    }
}
