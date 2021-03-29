
package pbo5.pkg2022431708.latihan56.umur_barang_cantik;

/**
 *
 * @author HP
 */
public class PBO52022431708Latihan56Umur_Barang_Cantik {

    /**
     * @param args the command line arguments
     */
      
    /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan Nama dan Umur Barang Antik
 *
 */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Radio radio = new Radio(234);
           radio.setName("Radio AM");
           
           System.out.println("Nama Barang Antik : "+radio.getName());
           radio.tampilUmur();
    }
    
}
