import java.util.*;
public class Rwvwesenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            b=b*10+a;
        }
        System.out.println(b);
    }
}
