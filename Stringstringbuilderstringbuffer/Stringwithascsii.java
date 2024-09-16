package Stringstringbuilderstringbuffer;
import java.util.*;
public class Stringwithascsii {
    public static String solution(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){ 
            char curr=str.charAt(i);
            //System.out.println(curr);
            char prev=str.charAt(i-1);
            //System.out.println(prev);
            int gap=(curr-prev);
            //System.out.println(gap);
            //System.out.println(gap);
            sb.append(gap);
            sb.append(curr);

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(solution(str));
        sc.close();
    }
}
