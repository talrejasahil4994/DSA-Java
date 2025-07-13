package BinarySearch;
import java.util.*;
public class ques01m2 {
   public static void main(String[] args) {
    int arr[]={1,2,2,2,3,4,5};
Scanner sc=new Scanner(System.in);
    int target=sc.nextInt();
    int n=arr.length;
    int ans[]=new int[2];
    int fp=-1;
    int low,high;
    low=0; high=n-1;
    while(low<=high){
        int mid =low+(high-low)/2;
        if(arr[mid]==target){
            if(mid>0&&arr[mid]==arr[mid-1]) high=mid-1; 
           else{ fp =mid; break;}
        }
        else if(arr[mid]<target) low=mid+1;
        else if(arr[mid]>target) high=mid-1;
    }
    int lp=-1;
       low=0; high=n-1;
    while(low<=high){
        int mid =low+(high-low)/2;
        if(arr[mid]==target){
            if(mid+1<n&&arr[mid]==arr[mid+1]) low=mid+1; 
           else{ lp =mid; break;}
        }
        else if(arr[mid]<target) low=mid+1;
        else if(arr[mid]>target) high=mid-1;
    }
    ans[0]=fp;
    ans[1]=lp;
   for (int i : ans) {
    System.out.print(i+" ");
   }
   } 
}
