
package Pertemuan2;


public class PlayerMaster {
    public static void main(String[] args) {
        Player pemain = new Player();
        pemain.pemain();
        if (pemain.isdead()){
            System.out.println("Pemain Anda Mati");
        }
        else {
            System.out.println("Pemain Anda Sudah Siap Dimainkan");
        }
        
    }
}
