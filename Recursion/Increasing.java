package Recursion;
import java.util.*;
public class Increasing {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Increase(n);
    }
    public static void Increase(int n){
        if(n==0){
            return;
        }
        Increase(n-1);
        System.out.println(n);
    }
}
