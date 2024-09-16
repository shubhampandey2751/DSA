package Arrays;
import java.util.*;
public class Arrayp {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arrays[]=new int[3];
    arrays[0]=1;
    arrays[1]=2;
    arrays[2]=3;
    System.out.println(arrays[0]);
    System.out.println(arrays[1]);
    System.out.println(arrays[2]);
    

    int size=sc.nextInt();
    int marks[]=new int[size];
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
       System.out.println(marks[i]);
    }
    sc.close();
    }
}
