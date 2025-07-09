package arrays;

import java.util.Scanner;

public class maxvaluefinder {
     public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        System.out.println("Please enter size of array:");
       int n=scc.nextInt();
        
        int[] arr =new int[n];
      int max=0;
      System.out.println("Enter "+n+" Numbers");
      for(int i=0;i<n;i++) {
        arr[i]=scc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++) {
    if(arr[i]>arr[i+1]) {
     if(arr[i]>max){
        max=arr[i];
     }}
      else {
        if(arr[i+1]>max) {
            max=arr[i+1];
        }
      }
        }
       System.out.println("Maximum value in array is ="+max);
    }
}
