package queue;
class dnode{
    dnode next;
    dnode prev;
    int val;
    dnode(int val){
        this.val=val;
    }
}
class deque{
    dnode head;//(front)
    dnode tail;//(rear)
    int size=0;
    void insert_front(int val){
        dnode temp=new dnode(val);
        if(size==0){head=tail=temp;}
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insert_rear(int val){
         dnode temp=new dnode(val);
        if(size==0){head=tail=temp;}
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    int delete_front(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        // else if(size==1){head=tail=null;}
         //else if ki jagah else m change kr skte h mam n bataya
         int data=head.val;
         head=head.next;
        if(head==null)tail=null;
        else head.prev=null;
        
        size--;
       return data;
    }
    int delete_rear(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        // else if(size==1){head=tail=null;}
        //else if ki jagah else m change kr skte h mam n bataya
        int val=tail.val;
        tail=tail.prev;
        if(tail==null)head=null;
        else tail.next=null;
        size--;  
        return val;   
     
    }
    int getfront(){
    if(size==0){
        System.out.println("Queue is empty"); return -1;
    }
    return head.val;
    }
    int getrear(){
        if(size==0){
        System.out.println("Queue is empty"); return -1;
    }
    return tail.val;
    }
    Boolean isEmpty(){
        if(size==0)return true;
        return false;
    }
    int size(){
        return size;
    }
    void erase(){
        head=tail=null;
        size=0;
    }
    void display(){
         if(size==0){
        System.out.println("Queue is empty"); return;}
        dnode temp=head;
        while(temp!=null){
          System.out.print(temp.val+" ");
          temp=temp.next;
        }
        System.out.println();
    }
}
public class dequeimplem {
    public static void main(String[] args) {
        deque d=new deque();
        d.insert_front(1);
        d.delete_rear();
    //    d.insert_front(2);
    //    d.insert_front(3);
    //    d.display();
    //     d.delete_front();
    //     d.display();
    //     d.delete_rear();
    //     d.display();
    //     d.insert_rear(6);
    //     d.insert_rear(8);
    //     d.display();
    //     System.out.println(d.getfront());
    //     System.out.println(d.getrear());
    //     System.out.println(d.isEmpty());
    //     System.out.println(d.size());
    //     d.erase();
    //     d.display();
    }
}
