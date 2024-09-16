package DS;
import java.util.*;
public class Linkedlist {
     public static void displayr(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");  
        displayr(head.next);
    }
    public static void displayreverse(Node head){
        if(head==null){
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data+" ");  // reverse list
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data; //value
        Node next;// address of next node
        Node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(5); //head
        // System.out.println(a);
        // System.out.println(a.data);
        // System.out.println(a.next);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b; // 5 ->3 9 8 16
        b.next=c; // 5 -> 3 -> 9 8 16
        c.next=d; // 5 ->3 -> 9 -> 8 16
        d.next=e; // 5  ->3 -> 9 ->8 ->16

        // System.out.println(b.data);
        // System.out.println(a.next.data);

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // Node temp=a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data+" ");
        //     temp=temp.next;
        // }

        // Node temp=a;
        // while(temp!=null){
        //     System.out.println(temp.data+" ");
        //     temp=temp.next;
        // }

        // display(a);
        // System.out.println();
        // display(a);
       
        // displayr(a);
        // displayreverse(a);
        System.out.println(length(a));

    }
    
}
