import java.io.*;
import java.net.*;
import java.util.*;

public class serverSide {

    private static ServerSocket serverSocket;
    private static final int PORT= 1234;
    public static void main(String[] args) {

        System.out.println("Opening port:" + PORT + "\n");
        
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (Exception e) {
            System.out.println("unable to attach port" + e.getMessage());
            System.exit(1);
        }

        do{
            handleClient();
        } while(true);


    }

    public static void handleClient(){
        Socket link = null;
        try {
            link =serverSocket.accept(); 

            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(),true);

            int numMsg = 0;
            String msg = input.nextLine();

            while(!msg.equals("***CLOSED***")){
                System.out.println("MESSAGE RECEIVED ->  " + msg);
                numMsg++;
                output.println("MESSAGE NUM = " + numMsg + " : " + msg);
                msg = input.nextLine();
            }
            output.println(numMsg + " :::MESSAGE RECEIVED::: ");


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        finally{
            try{
                System.out.println("CLOSING CONNECTION...... .");
                link.close();
            }catch(IOException e){

                System.out.println("UNABLE TO DISCONNECT.... " + e.getMessage());
                System.exit(1);
            }
        }
    }
    
}
