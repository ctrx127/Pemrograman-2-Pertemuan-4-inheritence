package pertemuan3;

public class contohprosedur {
    
//tanpa parameter
    void Ltrapesium (){
    int sA = 5;
    int sB = 10;
    int t = 6;
    
   double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    }
   //dengan parameter
    void trapesium (double sA,double sB , double t){
        
    double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    }
    
    //dengan static
    static void Ltrapesiumstatic(){
    int sA = 5;
    int sB = 10;
    int t = 6;
    
   double luas = 0.5 * t *(sA+sB);
        System.out.println("Luas Trapesium = " + luas);
    }
    
    public static void main(String[] args) {
        int sA = 5;
        int sB = 10;
        int t = 6;
        contohprosedur p = new contohprosedur();
        p.Ltrapesium();//tanpa parameter
        p.trapesium(sA, sB, t);//dengan parameter
        Ltrapesiumstatic(); //static
        
    }
    
}
