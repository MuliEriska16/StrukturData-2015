import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class utama {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (System.in);
            Chat tanya = new Chat ();
            System.out.println ("pesan:");
            String pesan = input.next();
            tanya.whois(pesan);

        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
