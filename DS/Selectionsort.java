package DS;
import java.util.*;
public class Selectionsort {
    static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){// i represent the current index
            // find the minimum element in unsorted part of array
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={7,4,5,1,2};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  ");
        }
    }
}
