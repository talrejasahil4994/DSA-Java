package arrays;
import java.util.*;
import java.util.ArrayList;

public class arraylistFUNCTIONS {

    public static void main(String[] args) {
        
    //    Scanner sc=new Scanner(System.in);
    //    ArrayList<Integer> arr=new ArrayList<>();
    //     for(int i=0;i<10;i++) {
    //         arr.add(i,sc.nextInt());
    //         }
            
           // System.out.println(arr);
            ArrayList<Integer> List=new ArrayList<>();
            //also we can define array list as
            //List<Integer> arr=new ArrayList<>();
              System.out.println(List +" "+List.size());
              List.add(10);
              System.out.println(List +" "+List.size());

              List.add(20);
              System.out.println(List +" "+List.size());
               List.remove(1);
               System.out.println(List +" "+List.size());

    }
    
}
