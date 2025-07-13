package linkedlist;

public class recursiveprint {
    public static void recprint(Node head){
        
        if(head==null){return;}//base case
      System.out.print(head.data+" ");//siddhi print//work
        recprint(head.next);//call
        System.out.print(head.data+" ");
        System.out.println();//reverse print
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
       n4.next=n5;
       recprint(n1);
       System.out.println(n1.data);//proof
       //aghr yaha main m shallow copy bana rha hu toh copy m jo edit kra hu maincopy m bhi hora h
       //upr jese rec k liye fn banaya h and then usme head liya toh voh bhi ak shallow copy h
       //but uski vajah s n1 edit ni hoga ,head alag s chlega. bus n1 k address head m store h vo usko change krega
       Node temp=n1;
       temp.data=11;
       System.out.println(n1.data);
        


    }
}
