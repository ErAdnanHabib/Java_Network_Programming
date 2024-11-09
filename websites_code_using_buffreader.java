
//OCSALY Academy - Java Network Programming // LECTURER : Typhon .M

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class websites_code_using_buffreader{
    public static void main(String[] args) throws IOException {

        try {
            URL url = new URL("https://linktr.ee");
            URLConnection myUrlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()));
            String myLine;
            while ((myLine = br.readLine()) != null) {
                System.out.println(myLine);
            }
            br.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}