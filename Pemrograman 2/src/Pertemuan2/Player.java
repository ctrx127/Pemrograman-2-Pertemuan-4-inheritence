
package Pertemuan2;

import java.util.Scanner;


public class Player {
    Scanner scan = new Scanner(System.in);
    int HP;
    
    public void pemain (){
     String nama,skill,role;
        
        System.out.print("Masukkan Nama Karakter Anda = ");
        nama = scan.next();
        
        System.out.print("Masukkan Role Karakter Anda = ");
        role = scan.next();
        
       System.out.print("Masukkan Skill Karakter Anda = ");
       skill = scan.next();
       
        
        
       System.out.print("HP = ");
       HP = scan.nextInt();
       
        System.out.println("=======Karakter Anda=======  ");
        System.out.println("Nama = " + nama);
        System.out.println("Skill = " + skill);
        System.out.println("Role = " + role);
        
       
        
    }
    public boolean isdead (){
        if (HP <= 0){
            return true;
           }
        else
        return false;
    }
    public static void main(String[] args) {
        
    }
}
   
    

