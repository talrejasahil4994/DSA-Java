package queue;
import java.util.*;
public class ques01 {
    public static void main(String[] args) {
        //reverse a queue using stack
        Queue<Integer> que=new LinkedList<>();
        
        Stack<Integer> st=new Stack<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        while(!que.isEmpty()){
            st.push(que.remove());
        }
       while(!st.isEmpty()){
        que.add(st.pop());
       }
     System.out.println(que);

    }
}
