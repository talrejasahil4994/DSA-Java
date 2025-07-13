package Tree;

import java.util.*;


class Node{
    Node left;
    Node right;
    int val;
    Node(int val){
        this.val=val;
    }
    
}
public class implement {
  public static class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
      this.node=node;
      this.level=level;
    }
  }
    private static void Display(Node root){
      if(root==null){return ;}
      System.out.print(root.val+" ");
      Display(root.left);
      Display(root.right);
    }
    private static int sum(Node root){
        if(root==null){return 0;}
       int sum=root.val+ sum(root.left)+sum(root.right);
        return sum;
    }
      private static int product(Node root){
        if(root==null){return 1;}
        int product=0;
       if(root.val!=0)
      product=root.val* product(root.left)*product(root.right);
      else product=1* product(root.left)*product(root.right);
        return product;
    }
    private static int max(Node root){
        if(root==null){return 0;}
       
       return Math.max(root.val,Math.max(max(root.left), max(root.right)));
        
    }
    private static int size(Node root){
        if(root==null){return 0;}
       int size=1+ size(root.left)+size(root.right);
        return size;
    }
    private static int level(Node root){
        if(root==null){return 0;}
       int level=1+ Math.max(level(root.left),level(root.right));
        return level;
    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if (root!=null)q.add(root);
     while (!q.isEmpty()) {
       Node front=q.remove();
        System.out.print(front.val+" ");
         if(front.left!=null)
        q.add(front.left);
          if(front.right!=null)
        q.add(front.right);
     }
     System.out.println();
    }
    public static void bfslevelwise(Node root){
      int prevlvl=0;
        Queue<Pair> q=new LinkedList<>();
        if (root!=null)q.add(new Pair(root, 0));
     while (!q.isEmpty()) {
       Pair front=q.remove();
       Node temp=front.node;
       int level=front.level;
       if(prevlvl!=level){System.out.println(); prevlvl++;}
        System.out.print(temp.val+" ");
       
         if(temp.left!=null)
        q.add(new Pair(temp.left, level+1));
          if(temp.right!=null)
        q.add(new Pair(temp.right, level+1));
     }
     System.out.println();
    }
    public static void main(String[] args) 
{//binary tree
Node a=new Node(1);
Node b=new Node(2);
Node c=new Node(3);
Node d=new Node(4);
Node e=new Node(5);
Node f=new Node(6);
a.left=b; a.right=c;
b.left=d; b.right=e;
c.right=f;
Display(a);
System.out.println();
int i=sum(a);
System.out.println(i);
int j=product(a);
System.out.println(j);
int z=max(a);
System.out.println(z);
int k=size(a);
System.out.println(k);
int g=level(a);
System.out.println(g);
bfslevelwise(a);
}

}
