package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class iterativeinorder {
     public static List<Integer> inorder(Node root,List<Integer> i){
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(true){ 
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()) break;
           Node top=st.pop();
           i.add(top.val);
           temp=top.right;
            }
        }
        return i;
    } 
    public static void main(String[] args) {
         Node a=new Node(1);
         Node b=new Node(2);
         Node c=new Node(3);
         Node d=new Node(4);
         Node e=new Node(5);
         Node f=new Node(6);
         Node g=new Node(7);

     a.left=b; a.right=c;
     b.left=d; b.right=e;
     c.left=f; c.right=g;
List<Integer> ans=new ArrayList<>();
System.out.println(inorder(a,ans));
    }
}
