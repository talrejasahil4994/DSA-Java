package BinarySearch;
import java.util.*;
public class ques04m2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int target=sc.nextInt();
    int arr[]={33,44,55,66,77,0,11,22};
    boolean i=false;
    int n=arr.length; int lo=0; int hi=n-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==target){   i=true; break;   }
        else if(arr[mid]<=arr[hi]){//mid is in right side.
            if(arr[mid]<target&&target<=arr[hi]){lo=mid+1;}
            else hi=mid-1;
        }
        else{//mid is in left side.
            if(arr[mid]>target&&target>=arr[lo]){
                hi =mid-1;
            }
            else{lo=mid+1;}
        }
    }
    if(i==true){System.out.println("success");}
    else System.out.println("no");
}
}
