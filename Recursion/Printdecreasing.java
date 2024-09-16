package Recursion;
import java.util.*;
public class Printdecreasing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdecresing(n);
    }
    public static void printdecresing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printdecresing(n-1);
    }
}
