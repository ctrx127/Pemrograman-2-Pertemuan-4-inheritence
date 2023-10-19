package Tugas1;
import java.util.Scanner;



public class Master {
    boolean islanjut = true;
    int nilai;
        String nama;
        Scanner scan = new Scanner (System.in);
       
        
     void eksekusi() {
        while (islanjut){

                   System.out.println("Input Data");
                   System.out.println("Masukkan Nama : ");
                   nama = scan.next();
                   System.out.println("Masukkan Nilai : ");
                   nilai = scan.nextInt();
                   if (nilai > 70){
                       System.out.println(nama + " dinyatakan Lulus");
                   }
                   else {
                       System.out.println(nama +" dinyatakan Tidak Lulus");
                   }
                break;

               
        }

            
            
        }
   
    }
    

