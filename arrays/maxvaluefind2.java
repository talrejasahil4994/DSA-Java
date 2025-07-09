package arrays;
import java.util.Scanner;

public class maxvaluefind2 {

     public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        System.out.println("Please enter size of array:");
       int n=scc.nextInt();
        
        int[] arr =new int[n];
    
      System.out.println("Enter "+n+" Numbers");
      for(int i=0;i<n;i++) {
        arr[i]=scc.nextInt();
        }
         // int max=arr[0];//max=-1;also can do and for -ve nos we can use Integer.MIN_value
         //Math.maxalso can  use here
          int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
    }
    System.out.println("Maximum value in array is ="+max);

    //second max value
    int smax=Integer.MIN_VALUE;
    for(int i=0;i<n;i++) {
   
        if(arr[i]>smax) {
            if(arr[i]!=max) {
            smax=arr[i];}
        }
}
System.out.println(" Second Maximum value in array is ="+smax);

}
}