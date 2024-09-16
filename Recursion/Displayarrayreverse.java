package Recursion;
import java.util.*;
public class Displayarrayreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        displayarrayreverse(arr,0);
    }
    public static void displayarrayreverse(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }
        displayarrayreverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
    
}
