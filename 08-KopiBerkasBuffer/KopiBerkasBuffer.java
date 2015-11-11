import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class KopiBerkasBuffer{
   
    public void kopi (String sumber, String sasaran) throws IOException {
        FileInputStream masukanfile = null;
        FileOutputStream keluaranfile = null;
       
        BufferedInputStream masukan = null;
         BufferedOutputStream keluaran = null;

        // Deklarasi variabel
        try {
            // Object stream untuk masukkan
            masukanfile = new FileInputStream(sumber);
            keluaranfile = new FileOutputStream(sasaran);// ambil objek abestu bukak nama berkasnya kalaok ga ada dia throw excepytion 
            
            masukan = new BufferedInputStream (masukanfile);
            keluaran = new BufferedOutputStream (keluaranfile);
            // Coba baca  dari stream
            int karakter = masukan.read();
            // Selama masih ada data yang masih bisa dibaca
            while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
            keluaran.flush();
        } 
        finally {
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();
            if (keluaran != null)
                keluaran.close();

        }
    }
}
