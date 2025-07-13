package BinarySearch;
public class ques12 {
    //Allocate Minimum Pages
//book allocation problem 
//mane kiya h manse
    public static boolean isTrue(int arr[],int k,int maxp){
       //code isliye chal ra h kyu ki count kim value 1se start h
        int count=1;
        int sum=0;
       
      for(int i=0;i<arr.length;i++){
          if(arr[i]+sum<=maxp){
              sum+=arr[i];
            
              
          }
          else{count++;
            //  sum=0;
            sum=arr[i]; // // sum+=arr[i];  
              
          }
      }
      if(count==k){
          return true;
      }
        else return false;
    }
    public static int findPages(int[] arr, int k) {
        int n=arr.length;
         int mx=0;
     int mn=Integer.MAX_VALUE; 
     int sum=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            mn=Math.min(mn,arr[i]);
            sum+=arr[i];
           
        }
               
    if(n<k){
        return -1;
    }
    
    if(n==k){
        
        return mx;
    }
    if(k==1){
       
        return sum;
    }
    int lo=mn; int hi=sum-mn; int ans=0;
  
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(isTrue(arr,k,mid)==true){
            ans=mid;
            hi=mid-1;
        }
        else lo=mid+1;
    }
    return ans;
    }
    public static void main(String[] args) {
        int arr[]={12, 34, 67, 90};
        int k=2;
        int ans=findPages(arr, k);
        System.out.println(ans);
    }
}
