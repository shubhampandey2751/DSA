// any base to Decimal
package Function;
import java.util.*;
public class Function6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int b=sc.nextInt();
        int d=getValueInDecimal(n,b);
        System.out.println(d);
        sc.close();
    }
    public static int getValueInDecimal(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*b;
        }
        return rv;
    }
    
}
