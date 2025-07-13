package Tree;

public class ques01levelorder {
    static int n=2;//we can also pass it in fn as value
    public static void levelprint(Node root,int level){
        if(root==null){return;}
        //optimize
        if(level>n){return;}
        if(level==n){System.out.print(root.val+" ");}
        levelprint(root.left, level+1);//we can not use level++ because it increse the value of level also
        //if level++ is used we get non incremented value in left.but it will increment after passing so,
        //right will get incremented value thats why it print 5,3
        levelprint(root.right, level+1);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
Node b=new Node(2);
Node c=new Node(3);
Node d=new Node(4);
Node e=new Node(5);
Node f=new Node(6);
a.left=b; a.right=c;
b.left=d; b.right=e;
c.right=f;
levelprint(a, 0);
System.out.println();
//full tree print in bfs method by loop
for(int i=0;i<3;i++){
    n=i;
levelprint(a, 0);
System.out.println();
}
    }
}
