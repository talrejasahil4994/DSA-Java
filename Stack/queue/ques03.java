package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ques03 {
    public static void main(String[] args) {
        //remove ele at even index from the queue(0 based indexing)
    Queue<Integer> que=new LinkedList<>();
     que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
    Queue<Integer> help=new LinkedList<>();
    System.out.println(que);
    // int i=0;
    // while(!que.isEmpty()){
    //     if((i%2)==1){help.add(que.remove());}
    //     else{que.remove();}
    //     i++;
    // }
    //we can also use first remove and then add element 
    while(!que.isEmpty()){
        que.remove();
        if(!que.isEmpty()){help.add(que.remove());}
    }
    while(!help.isEmpty()){
        que.add(help.remove());
    }
    System.out.println(que);

    }
}
