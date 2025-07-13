package BinarySearch;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int hi=n-1;
        int lo=0;
        boolean i=false;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){ i=true; break;}
            if(arr[mid]<=arr[hi]){
                if(arr[mid]<target&&arr[hi]>=target){
                  lo=mid+1;
                }
                else{hi =mid-1;}
            }
            else{
               if(arr[lo]<=target&&arr[mid]>target){
                hi=mid-1;
               }
               else{lo=mid+1;}
            }
        }
        System.out.println(i);
    }
}
