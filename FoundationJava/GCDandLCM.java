import java.util.*;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number of n1:");
        int n1=sc.nextInt();
        System.out.print("Enter the second number of n2:");
        int n2=sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int GCD=n2;
        int LCM=(on1*on2)/GCD;
        System.out.println("GCD is :"+GCD);
        System.out.println("LCM is :"+LCM);
        sc.close();
       


        
    }
    
}
