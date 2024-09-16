package Recursion;
import java.util.*;
public class Excercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println();
       

    }
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=fact(n-1);
        int f=n*fnm1;
        return f;
         
    }

}