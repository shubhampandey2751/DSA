package Pattern;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;// sp is the space
        int st=1; // st is the star
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
        sc.close();
    }
    
}
/*Output
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *
/* */
