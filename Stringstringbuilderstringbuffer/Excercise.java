package Stringstringbuilderstringbuffer;
import java.util.*;
class Excercise{
    public static String ASCI(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev =str.charAt(i-1);
            int gap=(int)(curr-prev);
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(ASCI(str));
    }
}