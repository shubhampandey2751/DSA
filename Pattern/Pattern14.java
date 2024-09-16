package Pattern;
import java.util.*;
public class Pattern14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            int v=x*i;
            System.out.println(x+" * "+i+ " = "+v);
        }
        sc.close();
    } 
}