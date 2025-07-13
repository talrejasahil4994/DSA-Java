package queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class que{
    Node head;
    Node tail;
    int size=0;
    void add(int val){
        Node n=new Node(val);
        if(size==0){ head=tail=n;}
     else { tail.next=n;
       tail=n;}
       size++;
    }
    int remove(){
        if(size==0){System.out.println("Queue is empty");return -1 ;}
        int val=head.val;
        head=head.next;
        size--;
        return val;

    }
    void peek(){
      if(size==0){System.out.println("Queue is empty");return  ;}
      System.out.println(head.val);
    }
    void size(){
        System.out.println(size);
    }
    Boolean isEmpty(){
        if(size==0){return true;}
        return false;
    }
    void display(){
         if(size==0){System.out.println("Queue is empty");return  ;}
         Node temp=head;
         while(temp!=null){
          System.out.print(temp.val+" ");
          temp=temp.next;
         }
         System.out.println();
    }
}
public class linklistimpl {
    public static void main(String[] args) {
        que q=new que();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.peek();
        q.size();
        System.out.println(q.isEmpty());

    }
}
