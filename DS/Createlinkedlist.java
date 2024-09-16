package DS;
public class Createlinkedlist {
    public static class Node{
        int data; //value
        Node next;// address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
               temp.next=head;
               head=temp; 
            }
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;

            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
             
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
         linkedlist ll=new linkedlist();
         ll.insertAtEnd(4);
         ll.insertAtEnd(5);
        //  ll.display();
        System.out.println(ll.size());
        ll.insertAtEnd(12);
        System.out.println();
        // ll.display();
        System.out.println();
        ll.insertAtHead(13);
        // ll.display();
        ll.insertAt(2,10 );
        ll.display(); 
        System.out.println();
        ll.insertAt(0, 45);
        ll.display();
        System.out.println(ll.getAt(3));
        System.out.println(ll.getAt(3));
    }
}
