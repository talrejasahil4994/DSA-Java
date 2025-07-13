package queue;

import java.util.ArrayList;

class que{
int f=-1;
int r=-1;
int size=0;
int arr[]=new int[5];
void add(int val){
    if(r==arr.length){System.out.println("Queue is full"); return ;}
    else if(r==-1&&f==-1){
        r=f=0;
        arr[r]=val;
       
    }
    else{
       //++ pehle lagay mtlb phele increse hoga then dalega
       //r++ k case m voh vaps 0 idx m dal raha tha jise ak ele ni ara tha
       //r++ phele 0 m dalega then ++ hoga
       //but ++r phele 0 to 1 hoga then insert hoga
        arr[++r]=val;
       
    }
     size++;
}
int remove(){
    if(f==r){System.out.println("Queue is empty"); return -1;}
   int val=arr[f++];
   size--;
 return val;
}
int peek(){
    if(size==0){System.out.println("empty"); return -1 ;}
    return arr[f];
}
Boolean isEmpty(){
    if(size==0){return true;}
    return false;
}
void display(){
    if(size==0){System.out.println("Queue is empty");return ;}
    for(int i=f;i<=r;i++){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
}
}
public class arrimple {

public static void main(String args[]){
    int arr[]={1,2};
    
    que q=new que();
    q.add(1);
    q.add(2);
    q.add(3);
    q.display();
    System.out.println(q.remove());
    q.display();
    System.out.println(q.size);//size k fun bana skte h
    System.out.println(q.peek());

}

}

