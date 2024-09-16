package Recursion;
import java.util.*;
public class Displayarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        displayarray(arr,0);
    }
    public static void displayarray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayarray(arr, idx+1); 
        
    }
    
}
