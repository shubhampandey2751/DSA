package Pattern;
import java.util.*;
public class excercise8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int sp=n/2;
        int st=1;
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");

            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                st+=2;
                sp--;
            }
            else{
                st-=2;
                sp++;
            }
            System.out.println();
        }
    }
}
