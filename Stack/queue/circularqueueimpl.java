package queue;
class circularqueue{
    int arr[]=new int[5];
    int size=0;
    int front=-1;
    int rear=-1;
    void add(int val){
    if(size==0)
    {
        front=rear=0;
        arr[rear]=val;
    }
    else if(size==arr.length){
       System.out.println("Queue is full"); return;
    }
    else if(rear<arr.length-1){arr[++rear]=val;}
    else if(rear==arr.length-1){rear=0; arr[0]=val;}
    size++;
    }
    int remove(){
        if(size==0){return -1;}
        else if(front==arr.length-1){
            int val=arr[front];
            front=0;
            size--;
            return val;
        }
        else{
            int val=arr[front];
            front++;
            size--;
            return val;
        }
    }
    void display(){
        if(size==0){System.out.println("Queue is empty"); return ;}
        if(front<rear){ for(int i=front;i<=rear;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();}
      else if(rear<=front) { for(int i=front;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();}
    }
}
public class circularqueueimpl {
    public static void main(String[] args) {
        circularqueue c=new circularqueue();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
     c.display();
     c.remove();
     c.remove();
     c.add(6);
     c.add(7);
     c.display();
     c.remove();
     c.add(8);
     c.display();
    }
}
