package queue;
import java.util.*;
public class ques04 {
    //time complex=O(n)
   //reverse first k elements of a queue;
   public static Queue<Integer> modifyqueue(Queue<Integer> q,int k){
    Stack<Integer> st=new Stack<>();
    int n=q.size();
      
    for(int i=0;i<k;i++){
        st.push(q.remove());
    }
    while(!st.isEmpty()){
        q.add(st.pop());
    }
    for(int i=0;i<n-k;i++){
        int val=q.remove();
        q.add(val);
    }
    return q;
   } 
   public static void main(String[] args) {
    int k=4;
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    System.out.println(modifyqueue(q,k));
   }
}
