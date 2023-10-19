/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

public class contohfuntion {
   
    //tanpa parameter
    double Ltrapesium (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    double luas = 0.5 * t *(sA+sB);
    
    return luas;   
    }
    

    //dengan parameter
    double trapesium (double sA, double sB ,double t){
    double luas = 0.5 * t *(sA+sB);
    return luas;   
    }

    //static
    static double Ltrapesiumstatic (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    double luas = 0.5 * t *(sA+sB);
    
    return luas;   
    }
    
    public static void main(String[] args) {
        int sA = 5;
        int sB = 10;
        int t = 6;
        contohfuntion p = new contohfuntion();
        System.out.println("Luas Trapesium = " + p.Ltrapesium());//tanpa parameter
        System.out.println("Luas Trapesium = " + p.trapesium(sA, sB, t));//parameter
        System.out.println("Luas Trapesium = " + Ltrapesiumstatic());//static
    }
}
