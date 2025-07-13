package Tree;

import java.util.*;

public class iterativepreorder {
    public static List<Integer> preorder(Node root,List<Integer> i){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node pop=st.pop();
            i.add(pop.val);
            if(pop.right!=null) st.push(pop.right);
            if(pop.left!=null) st.push(pop.left);
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
System.out.println(preorder(a,ans));
    }
}
