import java.util.*;
public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        String s="";
        for(int i=l-1;i>=0;i--){
            s+=str.charAt(i);
        }
        System.out.println(s);
        
    }
}
