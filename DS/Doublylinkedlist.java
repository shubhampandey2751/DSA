package DS;
import java.util.*;
public class Doublylinkedlist {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    // reverse linkedlist
    public static void displayreverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    // random given node and print the linkedlist
    public static void display2(Node random){
        Node temp=random;
        // Move this temp backwards to the head
        while(temp.prev!=null){
            temp=temp.prev;
        }
        // Now temp is at head
        // print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    // Insertion at head
    public static Node insertAtHead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    // Insert at end or tail
    public static void insertAtTail(Node head,int x){
        Node temp=head;
        // temp ko tail tak leke jaate hai.
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtidx(Node head,int idx,int x){
        Node s=head;
        for(int i=1;i<=idx-1;i++){
            s=s.next;
        }
        // s is at idx-1 position
        Node r=s.next; //idx
        Node t =new Node(x);
        //str
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a =new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        // displayreverse(e);
        // display2(c);
        // Node newHead=insertAtHead(a,35);
        // display(newHead);
        insertAtTail(a,98);
        display(a);
        insertAtidx(a, 3, 56);
        display(a);
    }
}
