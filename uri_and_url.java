import java.net.*;
// import java.util.*;

public class uri_and_url{

    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        String website = "https://en.wikipedia.org/wiki/URL";
        URI webURI = new URI("https","en.wikipedia.org","URI_normalization");

        URL myURL = new URL(website);
        System.out.println("--------------------URI implementation--------------------");
        getURI(webURI);
        System.out.println("--------------------URL implementation--------------------");
        getURL(myURL);
    }
        
    static void getURI(URI myUri){
        System.out.println(myUri.getAuthority());
        System.out.println(myUri.getPath());
        System.out.println(myUri.getFragment());
        System.out.println(myUri.getHost());
        System.out.println(myUri.getPort());
        System.out.println(myUri.getScheme());
        System.out.println(myUri.getQuery());
    }

    static void getURL(URL myURL){
        System.out.println(myURL.getAuthority());
        System.out.println(myURL.getPath());
        System.out.println(myURL.getHost());
        System.out.println(myURL.getPort());
        System.out.println(myURL.getQuery());
        System.out.println(myURL.getRef());
    }
}
