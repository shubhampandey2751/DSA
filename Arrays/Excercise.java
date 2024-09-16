package Arrays;
import java.util.*;
public class Excercise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int arr[][]=new int[rows][columns];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");;
			}
			System.out.println();
		}

	
	}
}
    
