package Stack;
import java.util.*;
public class pushatbottomandidx {
    public static void push_back(Stack<Integer> st,int val){
          Stack<Integer> temp=new Stack<>();
          while(!st.isEmpty()){
            temp.push(st.pop());
          }
          st.push(val);
          while(!temp.isEmpty()){
            st.push(temp.pop()); 
          }
    }
    public static void push_at_idx(Stack<Integer> st,int val,int idx){
         Stack<Integer> temp=new Stack<>();
         int n=st.size();
         for(int i=0;i<n-idx;i++){//n ki jagah direct aghr st.size dia toh voh jese jese 
            //ele pop honge size km hoti jaegi or voh kam chlega.
            temp.push(st.pop());
         }
         //also while(temp.size()>=idx)
          st.push(val);
          while(!temp.isEmpty()){
            st.push(temp.pop()); 
          }
    }
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
         System.out.println(st);
         push_back(st, 50);
         System.out.println(st);
        push_at_idx(st,6,2);                    
        System.out.println(st);
    }
}
