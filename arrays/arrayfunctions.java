package arrays;
import java.util.*;
public class arrayfunctions {
    public static void main(String[] args) {
        int[] arr={30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++) {
          System.out.print("->"+arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++) {
            System.out.print("->"+arr[i]+" ");
        }
        System.out.println();
        //for each loop
        //in this loop we read as for intx(indexing) in arr
        //we dont need size and indexing
        for(int x: arr){
            System.out.print(x+" ");
        }
        
    }
}
