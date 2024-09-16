import java.util.*;
public class Factorialnumber {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            //return n*fact(n-1);
            int product=1;
            for(int i=1;i<=n;i++){
                product=product*i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
