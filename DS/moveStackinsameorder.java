package DS;
import java.util.*;
public class moveStackinsameorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Stack<Integer>st=new Stack<>();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        /* */
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
    }
}
