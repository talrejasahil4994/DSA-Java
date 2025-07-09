package arrays;
import java.util.*;
public class copyofarray {
   public static void main(String[] args) {
    int[] arr={30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++) {
          System.out.print("->"+arr[i]+" ");
        }
        System.out.println(); 
        int[] nums =arr;//shallow copy
        //koi naya array ni bana h buss new name nums h arr k
        //sir n example m nums[0]=70 kiya or arr[0] print kiya
        //toh 70 print hua ..
        for (int x:nums) {
            System.out.print("->"+x+" ");

        }
        //example to show nums and arr are same with different names.
        System.out.println();
        nums[0]=70;
        System.out.println(arr[0]);  
        //deep copy-  
        int[] brr = Arrays.copyOf(arr,arr.length);
        for(int x: brr) {
            System.out.print(x+" ");
        }
        System.out.println();

        brr[0]=100;
//proofing of deep copy.
        for(int x: brr) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x: arr) {
            System.out.print(x+" ");
        } 
        //2nd method of deep copy.
        int[] crr =new int[arr.length];
          for(int i=0;i<arr.length;i++) {
            crr[i]=arr[i];
          }
          System.out.println();
          //proof
          crr[0]=90;
          for(int x:crr) {
            System.out.print(x+" ");
          }
          System.out.println();
          for(int x:arr) {
            System.out.print(x+" ");
          }
    } 
}
