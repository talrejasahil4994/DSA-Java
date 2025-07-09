package arrays;
import java.util.*;
public class QUES2 {
    public static void main(String[] args) {
        //find the doublets whose sum is equal to x in a array.
       Scanner sc =new Scanner(System.in);
       int x=sc.nextInt();
      
        int[] arr={2,-5,7,-1,0,9};
        int n=arr.length;
         for(int i=0;i<n;i++) {
            //nested loop
           for(int j=i+1;j<n;j++) {
            if(arr[i]+arr[j]==x) {
                System.out.println(i+" "+j+" ");
            }
           }
        }
    }
}
