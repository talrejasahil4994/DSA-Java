package arrays;

import java.util.Scanner;

public class linearsearch {
     public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        int n=scc.nextInt();
        
        int[] arr ={2,3,23,45,32,44};
        boolean b=false;
        for(int i=0;i<arr.length;i++) {
       if(n==arr[i]) {
        System.out.println("founded at "+ i);

        b=true;
       }
      
        }
        if(b == false) {
      System.out.println("not found");}
    }
}
