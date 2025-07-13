package BinarySearch;
import java.util.*;
public class bssahil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        boolean flag=false;
        while(lo<=hi)
        {
            int  mid=lo+(hi-lo)/2;
            if(arr[mid]==target){flag=true; break;}
            else if(arr[mid]>target){hi=mid-1;}
            else{ lo =mid+1;}
        }
        System.out.println(flag);
    }
}
