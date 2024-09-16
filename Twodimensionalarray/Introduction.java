package Twodimensionalarray;
import java.util.*;
public class Introduction {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }  
}
