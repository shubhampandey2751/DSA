package Arrays;
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int arr[]=new int[5];
        arr[0]=45;
        arr[1]=89;
        arr[2]=98;
        arr[3]=80;
        arr[4]=78;
        int[] two=arr;
        two[2]=690;
        //for(int i=0;i<arr.length;i++){
        //    System.out.println(arr[i]);
        //}
        for(int i=0;i<two.length;i++){
            System.out.println(two[i]);
        }
        sc.close();
    }
}
