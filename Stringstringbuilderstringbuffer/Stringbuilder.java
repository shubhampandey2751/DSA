package Stringstringbuilderstringbuffer;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
    /*StringBuilder sb =new StringBuilder("Hello");
    System.out.println(sb);                          
    char ch=sb.charAt(0);
    System.out.println(ch);
    sb.setCharAt(0,'d');
    System.out.println(sb);
    

    
    System.out.println("String : " + sb);
    // 1.
    System.out.println("Length of string : " + sb.length());
    // 2.
    System.out.println("First character : " + sb.charAt(0));
    // 3.
    sb.setCharAt(0, 'h');
    System.out.println("String : " + sb);
    // 4.
    sb.append(" reader");
    System.out.println("String : " + sb);
    //5.
    sb.deleteCharAt(5);
    System.out.println("String : " + sb);
    // 6.
    sb.delete(0, 5);
    System.out.println("String : " + sb);
    // 7.
    sb.replace(4, 6, "ing");
    System.out.println("String : " + sb);
    // 8.
    String str = sb.toString();
    System.out.println("String : " + str);
    
    /* */
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder sb=new StringBuilder(s);
    System.out.println(sb);
    char ch=sb.charAt(2);
    System.out.println(ch);
    sb.setCharAt(0,'d');
    System.out.println(sb);
    sb.append("Reader");
    System.out.println(sb);
    System.out.println(sb.length());
    sb.deleteCharAt(4);
    System.out.println(sb);
    System.out.println(sb.length());
    sb.replace(1,4,"vln");
    System.out.println(sb);

  }
}

