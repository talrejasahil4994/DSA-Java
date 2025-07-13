package BinarySearch;
public class ques14 {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
       
      
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
           int   mid=(lo+hi)/2;
         int  mis=arr[mid]-(mid+1);
            
            if(mis<k){
                lo=mid+1;
            }
           else hi=mid-1;
        }
      return k+(hi+1);  
   //return k+lo;
    }
    public  void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr, k));
    }
}
