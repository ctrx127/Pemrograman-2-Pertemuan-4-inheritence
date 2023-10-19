
package pertemuan3;

public class runbangundatar {
    public static void main(String[] args) {
    int sA = 5;
    int sB = 10;
    int t = 6;
        masterbangundatar luas = new masterbangundatar();
        System.out.println("Luas trapesium = " + luas.Ltrapesiumfun());;//function tanpa parameter
        luas.Ltrapesiumpro();//prosedur tanpa parameter
        luas.trapesiumpro(sA, sB, t);//prosedur parameter
        System.out.println("Luas trapesium = " + luas.trapesiumfun(sA, sB, t));//function parameter
        System.out.println("Luas trapesium = " + masterbangundatar.Ltrapesiumstaticfun());//function static
        masterbangundatar.Ltrapesiumstaticpro(); //prosedur 
    }
   
    
}
