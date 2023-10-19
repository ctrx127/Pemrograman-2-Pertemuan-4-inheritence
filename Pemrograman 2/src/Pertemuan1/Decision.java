
package Pertemuan1;

import java.util.Scanner;


public class Decision {
    public static void main(String[] args) {
        double belanja;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Belanjaan Anda = ");
        belanja = scan.nextInt();
        
        if (belanja > 100000){
            belanja = belanja - belanja*0.05 ;
            System.out.println("Selamat Anda Mendapatkan diskon 5%");
            System.out.println("Jadi total Belanjaan Anda adalah = " + belanja );
            
        }
        else {
            System.out.println("Anda Tidak Mendapat Diskon Apapun");
            System.out.println("Jadi total Belanjaan Anda adalah = " + belanja );
        }
        System.out.println("Terimakasih Telah berbelanja");
}
}