package pertemuan4inheritence;
import java.util.Scanner;

public class inputchar {
   Scanner scan = new Scanner(System.in);
   String nama;
   
    void input () {
        System.out.print("Masukkan Nama Karakter Anda = ");
        nama = scan.next();
    }
   void menu () {
       int pilihan;
       System.out.println("Pilih Role Yang Anda Inginkan :");
       System.out.println("1.Pemanah");
       System.out.println("2.Mage");
       System.out.println("3.Warior");
       System.out.print("Pilihan anda = ");
       pilihan = scan.nextInt();
       
       switch (pilihan) {
           case 1 :
               System.out.println("Selamat Karakter Anda Sudah Selesai Dibuat");
               System.out.println("Nama = " + nama );
               archer pemanah = new archer();
               pemanah.pemanah();
               pemanah.stats(100, 100, 30, 50, 20);
              break;
           case 2 :
               System.out.println("Selamat Karakter Anda Sudah Selesai Dibuat");
               System.out.println("Nama = " + nama );
                mage dukun = new mage();
                dukun.dukun();
                dukun.stats(100, 110, 40, 60, 20);
               break;
           case 3 : 
               System.out.println("Selamat Karakter Anda Sudah Selesai Dibuat");
               System.out.println("Nama = " + nama );
               warior ksatria = new warior ();
               ksatria.warior();
               ksatria.stats(100, 100, 20 , 40, 30);
               break;
           default :
               System.out.println("error");
       }
   }
    
}
