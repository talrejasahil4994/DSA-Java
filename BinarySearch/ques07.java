package BinarySearch;

public class ques07 {
    //leetcode1011 Capacity to ship package with d days.
    public static Boolean isPossible(int c,int arr[],int d){
        int load=0;
        int D=1;
        for(int i=0;i<arr.length;i++){
        if(load+arr[i]<=c){load=load+arr[i];}
        else{
          load=arr[i];
          D++;
        }
        }
        if(D>d){return false;}
        else return true;
  }
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int d=5;

      int n=arr.length;
      int mx=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<n;i++){
      mx=Math.max(mx,arr[i]);
      sum=sum+arr[i];
      }
      int lo=mx; int hi=sum; int minC=sum;//we can minC=0;too
      while(lo<=hi){//time complex=o(n*log(sum-mx))
         int mid=(lo+hi)/2;
    
          if(isPossible(mid,arr,d)==true){
              minC=mid;
              hi=mid-1;
          }
          else{lo=mid+1;}
      }
      System.out.println(minC);
    }
  }
