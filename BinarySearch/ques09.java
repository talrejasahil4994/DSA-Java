package BinarySearch;

import java.util.Arrays;
import java.util.*;
public class ques09 {
    //aggressive cows problem based on bs on ans
    //sir n hw diya tha
    public static boolean isTrue(int arr[],int k,int dist){

       
          int lastpos=arr[0];
        int cow=1;
          for(int i=1;i<arr.length;i++){
            if(arr[i]-lastpos>=dist){
               cow++;
                lastpos=arr[i];
            }
          }
          if(cow<k){return false;}//yaha error ara tha because m cow==k lera tha but
          //ex leke dekho aghr dist 2 dala toh 4 cow hojari h or apne ko 3 cow place krani thi
          //so it is the right ans ..
          else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,1,2,7,5};
        Arrays.sort(arr);
        
        int k=3;
        int n=arr.length;
        // int mx=Integer.MIN_VALUE;
        // int mn=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     mx=Math.max(mx,arr[i]);
        //     mn=Math.min(mn,arr[i]);
        // }
  int ans=0;
        int lo=1; int hi=arr[n-1]-arr[0];
        while(lo<=hi){
            int mid=(lo+hi)/2;
            System.out.println(mid);
            if(isTrue(arr,k,mid)==true){
                ans=mid;
                lo=mid+1;
                
            }
            else{hi=mid-1;}
        }
        System.out.println(ans);
    }
}
