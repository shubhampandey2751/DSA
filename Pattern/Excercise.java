import java.util.*;
public class Excercise{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
