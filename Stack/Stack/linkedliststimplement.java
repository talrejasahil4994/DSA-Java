package Stack;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
}
class stack{
    Node head=null;
    int size=0;
    void push(int data){
        Node temp=new Node( data);
            temp.next=head;
            head=temp;
        size++;
    }
    int pop(){
        if(size==0){return -1;}
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    int peek(){
        if(size==0){return -1;}
        else{
            return head.data;
        }
    }
    Boolean is_empty(){
        if(size==0){return true;}
        else return false;
    }
    void size(){
        System.out.println(size);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class linkedliststimplement {
    public static void main(String[] args) {
        stack st=new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.size();
        st.display();
        st.pop();
        st.display();
        System.out.println();
        st.size();
        System.out.println(st.is_empty());
        
    }
}
