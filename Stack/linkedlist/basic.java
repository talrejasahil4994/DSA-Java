package linkedlist;



class Node{//class ak bar bana do or har jagah package import use kr skta hu
    int data;
    Node next;//by default har ele k next m null store hoga
    Node(int data){
        this.data=data;
    }
}
public class basic {
    public static void print(Node head){
       Node temp=head;
       System.out.println();
        while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
        }
    }
    public static Node reverse (Node n1) {
        Node prev=null;
        Node curr=n1;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        System.out.println(n1.next);//default null yaha pr n2 k address aega
        System.out.println(n1);//adress of n1
        Node n2=new Node(20);
        n1.next=n2;
        //both give same address because n1 k next m n2 ki info or address store h
        System.out.println(n1.next);
        System.out.println(n2);
        System.out.println(n2.next);
        System.out.println(n1.next.data);
        Node n3=new Node(30);
        n2.next=n3;//n1.next.next=n3
        System.out.println(n1.next.next.data);
        //shallow copy
        Node temp=n1;
        System.out.println(temp.data);
        //deep copy
        Node temp1=new Node(10);
        System.out.println(temp1.data);
        //traverse
        temp=temp.next;
        System.out.println(temp.data);
        Node n4=new Node(40); 
        Node n5=new Node(50);
      
        n3.next=n4;//30->40
        n4.next=n5;//30->40->50
        
        //print by loop
        temp=n1;
        while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
        }
        //make a fn for print
        print(n1);
        temp=reverse(n1);
        print(temp);
    }
}
