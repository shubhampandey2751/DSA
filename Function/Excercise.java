package Function;
import java.util.*;
public class Excercise {
    public static int fact(int x){
        int rv=1;
           for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv; 
    }
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r =sc.nextInt();

        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        System.out.println("npr is the " + n + "p"+ r + " = " + npr);
        sc.close();
    }
    // create a class bankaccount  like acount number balancr ineer class credit and devit inner classs should have method
    
}
