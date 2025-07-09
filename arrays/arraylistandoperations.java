package arrays;
import java.util.*;

public class arraylistandoperations {
    public static void main(String[] args) {
    //syntax
        ArrayList<Integer> arr = new ArrayList<>(6);
    //6 is capacity it can increase by just adding more elements.
        //initialise
     arr.add(0,10);
     arr.add(1,20);
     arr.add(2,30);
     arr.add(3,40);
     arr.add(4,50);
     arr.add(5,60);
     arr.add(6,60);

     //error if we remove any elements
     //array has 0 by default not in arraylist.
     //if we remove all then it show empty.
for(int x:arr) {
    System.out.print(x+" ");
}
//we can use arr.get(i) in normal for loop.
System.out.println();
//direct print
System.out.println(arr);

//change or updation 
arr.set(0,80);

System.out.println(arr);
//arr.size is operation 
System.out.println(arr.size());
for(int i=0;i<arr.size();i++){
    System.out.print(arr.get(i)+" ");
}
System.out.println();
//ise piche jake value chupk jaegi *name -push back 
arr.add(79);
System.out.println(arr);
System.out.println(arr.size());

    }
}
