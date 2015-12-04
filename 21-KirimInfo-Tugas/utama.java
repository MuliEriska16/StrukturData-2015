import java.io.IOException;
import java.net.UnknownHostException;

public class utama {
    public static void main(String[] args) {
        try {
            DomainSiapa tanya = new DomainSiapa();
            tanya.whois("Muli Eriska_1408107010015");
        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
