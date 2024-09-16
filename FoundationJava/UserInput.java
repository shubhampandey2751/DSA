import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();


        System.out.println("Dear " +  name + " Here is the counting");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
        
    }
    
}
