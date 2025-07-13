package linkedlist;
class SSL{
    Node head;
     Node tail;
    int size;
public void add_back(int i){ 
 Node temp=new Node(i);
 if(head==null)
{
    head=tail=temp;
}
else{
    tail.next=temp;
    tail=temp;
}
size+=1;
}
public void display() {
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.err.println();
}
public void add_front(int i){
Node temp=new Node(i);//i=value
if(head==null)
{
    head=tail=temp;
}
else{
temp.next=head;
head=temp;}
size+=1;
}
public void size(){

    System.out.println(size);
}
public void add_atpos(int i,int value){
    if(i==1){add_front(value); return;}
    if(i==size+1){add_back(value); return;}
    if(i>size+1){System.out.println("INVALID POS");return;}
    Node move=head;
    Node temp=new Node(value);
    
  for(int j=0;j<i-2;j++){
        move=move.next;
  }
    
 temp.next=move.next;//move k next k next ni aega voh fir jada age k address dal jaega...apne ko move k next m address h usko temp k next m dalna h
  move.next=temp;
 size++;
}
public void remove_back() throws Error{
    if(head==null){throw new Error("List is empty");}
    Node Move=head;
    // while(Move.next.next!=null){
    //     Move=Move.next;
    // }
    while(Move.next!=tail){
    Move=Move.next;
    }
     tail=Move;
    Move.next=null;
    size--;
}
public void remove_front() throws Error{
    if(head==null){throw new Error("List is empty");}
  head=head.next;
  size--;
}
public void remove_frompos(int j)throws Error{
    if(j<0||j>size){throw new Error("invalid idx");}
    if(j==1){remove_front(); return;}
    if(j==size){remove_back(); return;}
    Node Move=head;
    for(int i=0;i<j-2;i++){
        Move=Move.next;
    }
    Move.next=Move.next.next;
    size--;
}
 int get_value(int idx) throws Error{
    //time complexity O(n) rahegi jab ki array m O(1) rehti h
    if(idx<0||idx>size){throw new Error("Invalid Idx");}
    if(idx==size){return tail.data;}
    Node move=head;
    for(int i=0;i<idx-1;i++){
     move=move.next;
    }
    return move.data;
}
void set_value(int idx,int val) throws Error{//set value m apan ko node ki value badal deni h new node banake ni jodni
    //time complexity O(n) rahegi jab ki array m O(1) rehti h
    if(idx<0||idx>size){throw new Error("Invalid Idx");}
    if(idx==size){tail.data=val;}
    Node move=head;
    for(int i=0;i<idx-1;i++){
     move=move.next;
    }
   move.data=val;
}
void traverse() {
    while (head != null && head.next != null) {
    System.out.print(head.data + " ");
    head = head.next.next;
    }
    }

}
public class USERLINK{
public static void main(String[] args) {
    SSL S=new SSL();
    S.add_front(10);
    S.add_back(20);
    S.add_back(30);
    S.add_back(40);
    S.add_back(50);

S.display();
S.traverse();


}
}