/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;


public class masterbangundatar {
  //function
    //tanpa parameter
    double Ltrapesiumfun (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    double luas = 0.5 * t *(sA+sB);
    
    return luas;   
    }
    

    //dengan parameter
    double trapesiumfun (double sA, double sB ,double t){
    double luas = 0.5 * t *(sA+sB);
    return luas;   
    }

    //static
    static double Ltrapesiumstaticfun (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    double luas = 0.5 * t *(sA+sB);
    
    return luas;   
    }
 //Prosedur
   //tanpa parameter
    void Ltrapesiumpro (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    
   double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    }
   //dengan parameter
    void trapesiumpro (double sA,double sB , double t){
        
    double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    }
    
    //dengan static
    static void Ltrapesiumstaticpro(){
    int sA = 5;
    int sB = 10;
    int t = 6;
    
   double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    } 
    
    
}
