package linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class ques02 {
    // 876. Middle of the Linked List
 public static  Node middleNode(Node Head) {
        Node slow=Head;
        Node fast=Head;
        // while(fast.next!=null&&fast.next.next!=null){//if we want left middle in even case 
            while(fast!=null&&fast.next!=null){//if we want the right middle as in ques..
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void print(Node Head){
        while(Head!= null ){
            System.out.print(Head.data+" ");
            Head=Head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node n1=new Node(50);
        Node n2=new Node(60);
        Node n3=new Node(70);
        Node n4=new Node(80);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
         print(n1);
       System.out.println(  middleNode(n1).data);
         
    }
}
