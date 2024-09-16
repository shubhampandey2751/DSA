package Function;
import java.util.*;
public class Function1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // write a program throw catch and try block handling
        int n=sc.nextInt();
        int r=sc.nextInt();
 
        int nfact=1;
        for(int i=1;i<=n;i++){  
            nfact*=i;
        }
        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact*=i;
        }
        int npr=nfact/nmrfact;
        System.out.println(n+"p"+r+" = "+npr);
        sc.close();
    }

}

