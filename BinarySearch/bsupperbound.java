package BinarySearch;

import java.util.Scanner;

public class bsupperbound {
   public static void main(String[] args) {
    //JO BHI VALUE ENTER USSE AK BADA INDEX
      Scanner sc=new Scanner(System.in);
        int arr[]={1,4,4,4,5};
        int n=arr.length;
        
        int x=sc.nextInt();
        int low=0;
        int high=n-1;
        int up=n;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                up=Math.min(mid, up);
                high=mid-1;
            }
            else{low=mid+1;}
           
        }
        System.out.println("UPPER BOUND: "+up);
      
   } 
}
