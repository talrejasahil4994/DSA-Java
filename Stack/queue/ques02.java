package queue;
import java.util.*;
public class ques02 {
    public static void main(String[] args) {
        //print all the elements present in the queue only by using add(),remove(),
        //peek(), size()& extra queue.
        Queue<Integer> que=new LinkedList<>();
                Queue<Integer> help=new LinkedList<>();
       que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while(!que.isEmpty()){
            System.out.print(que.peek()+" ");
            help.add(que.remove());
        }
        while(!help.isEmpty()){
            que.add(help.remove());
        }
    }
}
