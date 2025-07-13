package BinarySearch;
import java.util.*;
public class ques06m2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]={21212,10101,12121};
    int t=sc.nextInt();
    int n=arr.length;
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
       mx= Math.max(mx,arr[i]);
    }
   int in=0;
    int lo=1; int hi=mx;
    //time complexity is  for loop n times chlega but vo mid ka liye chlega jo ki log mx times aegi
    //so total tc is nlogmx.
    //by binary search ..
    //sir n issafe karke boolean fn banaya tha for usme mid arr and t pass krke sara kamm kra
    //for loop and sum wala.
    while(lo<=hi){
        int mid=(lo+hi)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%mid==0) {sum+=arr[i]/mid;}
            else {sum+=arr[i]/mid + 1;}
        }
        if(sum<=t){ in=mid;hi=mid-1;}
        else{lo=mid+1;}
  
    }
    System.out.println(in);
    }
}
