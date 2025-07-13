package BinarySearch;
import java.util.*;
public class bs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,4,4,4,5};
        int target=sc.nextInt();
        int n=arr.length;
        int hi=n-1;
        int lo=0;
      int fp=-1;
      int lp=-1;
      
        while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==target){ 
    if(mid>0&&arr[mid]==arr[mid-1]){
            hi=mid-1;}
            else{fp=mid; break;}
           }
           else if(arr[mid]>target){ hi=mid-1;}
           else if(arr[mid]<target){ lo=mid+1;}
          
        }
       lo=0;
       hi=n-1;
       while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==target){
            if(mid+1<n&&arr[mid]==arr[mid+1])
        {         lo=mid+1;}
        else{lp=mid; break;}
        }
        else if(arr[mid]>target){ hi=mid-1;}
           else if(arr[mid]<target){ lo=mid+1;}
       }
       System.out.println(fp+" "+lp);
    }
}
