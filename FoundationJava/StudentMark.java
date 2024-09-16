import java.util.*;
public class StudentMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student"); 
        float marks=sc.nextFloat();
        if(marks>90){
            System.out.println("Excellent");
        }
        else if(marks>80){
            System.out.println("good");
        }
        else if(marks>70){
            System.out.println("fair");
        }
        else if(marks>60){
            System.out.println("Expectation"); 
        }
        else{
            System.out.println(" below par");
        }
        sc.close();
    }  
}
