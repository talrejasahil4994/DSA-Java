package BinarySearch;

public class ques11 {
    //leetcode875 Koko Eating Bananas...
    public Boolean isPossible(int h,int k,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0){h-=arr[i]/k;}
           
            else{  h-=(arr[i]/k + 1);}

           
        }
        if(h<0){return false;}
        else{return true;}
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
        
        int lo=1; int hi=mx; int k=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(h,mid,arr)==true){
                k=mid;
                hi=mid-1;
            }
            else {lo=mid+1;}
        }
            return k;
    }
    public void main(String args[]){
        int arr[]={3,6,7,11};
        int h=8;
      int ans=  minEatingSpeed(arr, h);
      System.out.println(ans);
    }
}
