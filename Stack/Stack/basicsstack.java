package Stack;
import java.util.*;
public class basicsstack {
   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    st.addLast(4);
    System.out.println(st);
    st.addFirst(0);
    System.out.println(st);
st.add(2,5);
System.out.println(st);
System.out.println(st.peek());
System.out.println(st.pop());
System.out.println(st);
System.out.println(st.size());
System.out.println(st.isEmpty());
Stack<Integer> reverse=new Stack<>();
while(!st.isEmpty()){//we use ! (negates) because if empty then 
    //it will show true and false if not empty and we wont just opposite

    reverse.push(st.pop());
}
System.out.println(reverse);

   } 
}
