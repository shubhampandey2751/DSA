package Function;
import java.util.*;
public class Function3 {
    public static void display(int n,int r,int npr){
        System.out.println(n+"p"+r+ " = " + npr);
    }
    public static int fact(int x){
          int rv=1;

        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // write a program throw catch and try block handling
        int n=sc.nextInt();
        int r=sc.nextInt();
 
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        
        int npr=nfact/nmrfact;
        display(n,r,npr);
        sc.close();
    }
    
}
