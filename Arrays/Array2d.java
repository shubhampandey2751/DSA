package Arrays;
import java.util.*;
public class Array2d {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows =sc.nextInt();
    int columns=sc.nextInt();
    int arr[][]=new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();   
    }
    for(int i=0;i<rows;i++){
        int min=0;
        for(int j=1;j<columns;j++){
        if(arr[i][j]<arr[i][min]){
            min=j;
        }
    System.out.println(min);
    }
    int max=0;
    for(int k=1;i<rows;i++){
        if(arr[k][min]<arr[max][min]){
            max=k;
        }
    System.out.println(max);
    }
    
    }
    sc.close();
    }   
}
