package BinarySearch;

public class ques13 {
   //painter s  partion problem
   //here we have given array of board which should be paint by k painter 
   //here array consists of units of works in each board
   //painter will take 1 unit of time to paint 1 unit of board
   //that ques is similar to book allocation problem .
        public boolean isTrue(int arr[],int k,int t){
            int count=1;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]<=t){
                    sum+=arr[i];
                }
                else{
                    count ++;
                    sum=arr[i];
                }
            }
            if(count==k){return true;}
            else{
                return false;
            }
        }
        public int minTime(int[] arr, int k) {
            int n=arr.length;
            int sum=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                max=Math.max(max,arr[i]);
                sum+=arr[i];
            }
            if(k==1){
                return sum;
            }
            int lo=max;
            int hi=sum;
            int ans=0;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                
                if(isTrue(arr,k,mid)==true){
                    ans=mid;
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            return ans;
        }
        public  void main(String[] args) {
            int arr[]={40,30,10,20};
            int k=2;
            int ans=minTime(arr,k);
            System.out.println(ans);
        }
    }
    

