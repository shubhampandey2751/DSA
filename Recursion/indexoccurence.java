package Recursion;
import java.util.*;
public class indexoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int f1=firstIndex(arr,0,d);
        System.out.println(f1);
    }
    public static int firstIndex(int[] arr,int idx,int x){
        if(idx==arr.length){
            return -1;
        }
        int filsa =firstIndex(arr, idx+1, x);
        if(arr[idx]==x){
            return idx;
        }
        else{
            //int filsa =firstIndex(arr, idx+1, x);
            return filsa;
        }

    }
    
}
