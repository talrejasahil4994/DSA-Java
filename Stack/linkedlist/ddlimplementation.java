package linkedlist;
class dll{
dnode head;
dnode tail;
int size;
void Size(){System.out.println(size);}
void display(){
    dnode temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp =temp.next;
    }
    System.out.println();
}
void insert_at_tail(int val){
    dnode temp=new dnode(val);
    if(size==0){
        head=tail=temp;
    }
    else{
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
    }
    size++;
}
void insert_at_head(int val){
     dnode temp=new dnode(val);
    if(size==0){
        head=tail=temp;
    }
    else{
        head.prev=temp;
        temp.next=head;
        head=temp;
    }
    size++;
}
void insert_at_index(int idx,int val){
     dnode temp=new dnode(val);
    if(idx==0){
        insert_at_head(val); return;
    }
    else if(idx==size){insert_at_tail(val); return;}
    else{
        dnode dummy=head;
       for(int i=0;i<idx-1;i++){
       dummy=dummy.next;
       }

    //sir ki trick 
    //x =dummy sir k m
    //dnode y=x.next;
    //x.next=temp; temp.prev=x;
    //y.prev=temp; temp.next=y;
       temp.next=dummy.next;
       dummy.next.prev=temp;
       dummy.next=temp;
       temp.prev=dummy;
    }
    size++;
}
void delete_head(){
    head=head.next;
    head.prev=null;
    size--;
}
void delete_tail(){
    tail=tail.prev;
    tail.next=null;
    size--;
}
void delete_at_idx(int idx){
    if(idx==0){delete_head();return;}
    if(idx==size-1){delete_tail();return;}
     dnode x=head;
       for(int i=0;i<idx-1;i++){
       x=x.next;
       }
       dnode y=x.next.next;
       x.next=y;
       y.prev=x;
      size--;
}
void get_idx(int idx){
    if(idx==0){System.out.print(head.data+" ");}
    else if(idx==size-1){System.out.print(tail.data+" ");}
    else {
        dnode temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        System.out.print(temp.data+" ");
    }
    System.out.println();
}
void set_at_idx(int idx,int val){
 
    if(idx==0){
        head.data=val;
        return ;
    }
    else if(idx==size-1){tail.data=val; return ;}
    else{
        dnode dummy=head;
       for(int i=0;i<idx;i++){
       dummy=dummy.next;
       }
      dummy.data=val;
    }
  
}
}
public class ddlimplementation {
   public static void main(String[] args) {
    dll temp=new dll();
    temp.insert_at_tail(10);
    temp.insert_at_tail(20);
    temp.insert_at_tail(30);
    temp.display();
    temp.Size();
    temp.insert_at_head(00);
    temp.insert_at_head(05);
    temp.display();
    temp.insert_at_index(5, 15);
        temp.display();
        temp.delete_head();
        temp.delete_tail();
        temp.display();
        temp.delete_at_idx(0);
        temp.display();
        temp.get_idx(1);
        temp.set_at_idx(0, 12);
        temp.display();
   } 
}
