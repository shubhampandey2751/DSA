package Linkedlist;

import java.io.*;

public class L4addlast {
    public static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                //Node temp = new Node();
                //temp.data = val;
                //temp.next = null;
                head = tail = temp;
                size++;
            } else {
                //Node temp=new Node();
                //temp.data=val;
                //temp.next=null;
                tail.next=temp;
                tail=temp;
                size++;
            }
            size++;
        }
    }

    public static void main(String[] args) {

    }

}
