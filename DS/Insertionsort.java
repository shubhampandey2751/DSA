package DS;
import java.util.*;
public class Insertionsort {
    static void insertionsort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                // swap a[j],a[j-1]
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={8,3,6,5,4,2};
        insertionsort(a);
        /*for(int val:a){
            System.out.println(val+" ");
        }*/
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"  ");
        }

    }
    
}
