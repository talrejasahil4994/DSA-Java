package linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class ques01 {
//     //leetcode237. Delete Node in a Linked List
//     There is a singly-linked list head and we want to delete a node node in it.

// You are given the node to be deleted node. You will not be given access to the first node of head.

// All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

    
    public static void deleteNode(Node Node) {
       
      
     Node.data=Node.next.data;
     Node.next=Node.next.next;
     return;
    }
    public static void print(Node Head){
        while(Head!= null ){
            System.out.print(Head.data+" ");
            Head=Head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Main part aghr head k access ni ho toh delete kese krenge 
       Node n1=new Node(50);
       Node n2=new Node(60);
       Node n3=new Node(70);
       Node n4=new Node(80);
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
        print(n1);
        deleteNode(n3);
        print(n1);
        SSL s=new SSL();
        s.add_back(50);
        s.add_back(60);
        s.add_back(70);
        s.add_back(80);
        deleteNode(s.head.next);//head private kr dunga toh ni hoga yaha fir ormere pass bich k acces ni h
        s.display();
        
     }

}
