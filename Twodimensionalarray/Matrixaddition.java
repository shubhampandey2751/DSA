package Twodimensionalarray;
import java.util.*;
public class Matrixaddition{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int one[][]=new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]=sc.nextInt();
            }
        }
        int two[][]=new int[r1][c1];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                sum[i][j]=one[i][j]+two[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
