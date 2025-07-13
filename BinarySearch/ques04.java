package BinarySearch;
import java.util.*;
public class ques04 {
    public static int binsearch(int arr[],int lo,int hi,int t) {
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==t) {return mid;}
            else if(arr[mid]<t) {lo=mid+1; }
            else if(arr[mid]>t){ hi=mid-1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        //search in rotated sorted array
        //leetcode 33
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]={3,4,5,6,7,0,1,2};
        
        int n =arr.length;
        int lo=0;
        int hi=n-1;
        int i=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){i=mid; break;}
           else if(arr[mid]<arr[mid+1]&&arr[mid]<arr[mid-1]){i=mid-1; break;}
            else if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]){
                if(arr[mid]>arr[n-1]){lo=mid+1;}
                else hi=mid-1;
            }
        }
        int left=binsearch(arr,0,i,t);
        if(left==0) {int right=binsearch(arr, i+1,n-1,t);
        System.out.println(right);}
        if(left!=0)System.out.println(left);
       

    
    }
 
}
