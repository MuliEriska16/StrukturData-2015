import java.io.IOException;
import java.net.UnknownHostException;

public class Utama {
    public static void main(String[] args) {
        try {
            Chat tanya = new Chat();
            tanya.whois("GET index.html");
        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
