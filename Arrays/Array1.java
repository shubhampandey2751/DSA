package Arrays;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;                  // Decleration
        arr=new int[5];            // Initilization
        //int[] arr1=new int[5];
        arr[0]=85;
        arr[1]=43;
        arr[2]=67;
        arr[3]=98;
        arr[4]=87;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
