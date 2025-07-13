package linkedlist;

class dnode{
    int data;
    dnode next;
    dnode prev;
    dnode(int data) {
       this.data=data;
    }
}
public class doublyLL {
    public static void print(dnode head){
        dnode temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    } 
    public static void printrev(dnode tail){
        dnode temp=tail;
        while(temp!=null){
             System.out.print(temp.data+ " ");
            temp=temp.prev;
        }
    }
    public static void display(dnode node){
        dnode temp=node;
        while(temp.prev!=null){
        //temp!=null nhi likh skte kyu ki voh null p poch gaya toh next use kese krenge
            temp=temp.prev;
        }
       print(temp);
    }
    public static Boolean ispalindrome( dnode head,dnode tail){
        dnode temp1=head;
        dnode temp2=tail;
        while(temp1!=temp2){
           if(temp1.data!=temp2.data){ return false;}
           temp1=temp1.next;
           temp2=temp2.prev;
        }
        return true;
    }
public static void main(String[] args) {
    dnode a=new dnode(10);
    dnode b=new dnode(10);
    dnode c=new dnode(50);
    dnode d=new dnode(10);
    dnode e=new dnode(10);
   
   
    a.next=b;  b.prev=a;
    b.next=c;  c.prev=b;
    c.next=d;  d.prev=c;
    d.next=e;  e.prev=d;
    print(a);
    System.out.println();
    printrev(d);
    System.out.println();
    display(b);
   Boolean i= ispalindrome(a,e);
   System.out.println(i);
}    
}
