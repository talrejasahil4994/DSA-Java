package Stack;
import java.util.*;
public class recursiveprint {//recursion k through normal print krana h toh
    //print statement fn call k baad likh do
    public static void recurse(Stack<Integer> st){
        if(st.empty()){return;}
      int i=st.pop();
      System.out.println(i);
       recurse(st);
       st.push(i);
       
    }
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
         System.out.println(st);
         recurse(st);
         System.err.println(st);
         
    }
}
