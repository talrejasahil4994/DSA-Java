package BinarySearch;
public class ques10{
    //leetcode2187 -Minimum Time to Complete Trips
    public static Boolean isTrue(int arr[],int tt,long t){
        long sum=0;
       for(int i=0;i<arr.length;i++){
          
           sum+=t/arr[i];
       }
       if(sum<tt){return false;}
       else return true ;
   }
   public static long minTime(int[] arr, int tt) {
       int n=arr.length;
       
       long mn=Long.MAX_VALUE;
       for(int i=0;i<n;i++){
           mn=Math.min(mn,arr[i]);
       }
      long lo=mn; long hi=mn*tt; Long t=mn;
       while(lo<=hi){
           Long mid=lo+(hi-lo)/2;
           if(isTrue(arr,tt,mid)==true){t=mid; hi=mid-1;}
           else{lo=mid+1;}
       }
       return t;
   }
   public static void main(String[] args) {
    int arr[]={2};
    int tt=1;
    long ans=minTime(arr, tt);
    System.out.println(ans);
   }
}
