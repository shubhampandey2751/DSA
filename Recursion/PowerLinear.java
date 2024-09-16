package Recursion;
import java.util.*;
public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int a=power(x,n);
        System.out.println(a);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int fnm1=power(x, n-1);
        int fm1=x*fnm1;
        return fm1;
    }
    
}
