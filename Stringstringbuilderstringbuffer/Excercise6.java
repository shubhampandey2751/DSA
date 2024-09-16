package Stringstringbuilderstringbuffer;
import java.util.*;
public class Excercise6 {
    public static boolean palindrom(String sb){
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void solution(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sb=s.substring(i,j);
                if(palindrom(sb)==true){
                    System.out.println(sb);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        solution(s);

    }

}
       