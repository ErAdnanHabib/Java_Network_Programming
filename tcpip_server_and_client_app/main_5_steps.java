import java.io.*;
import java.net.*;
import java.util.*;

public class main_5_steps {

    public static void main(String[] args) throws IOException {
        
        // Now step 1
        ServerSocket serverSocket = new ServerSocket(1092); //1025-65535

        //Now step 2
        Socket link = serverSocket.accept();

        //step3
        Scanner input = new Scanner(link.getInputStream());
        PrintWriter output = new PrintWriter(link.getOutputStream());

        //step4
        output.println("awaiting for data......");
        String myinput = input.nextLine();

        //step5
        link.close();
    }
}

