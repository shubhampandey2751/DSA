package Stacks;
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" Pandey");
        System.out.println(sb);
        sb.replace(0,5,"vivek"); 
        System.out.println(sb);
        sb.delete(3,7);
        System.out.println(sb);
        System.out.println(sb.reverse());

        StringBuilder st=new StringBuilder("RAM");
        System.out.println(st.reverse());
    }
    
}