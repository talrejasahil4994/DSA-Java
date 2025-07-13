package BinarySearch;

public class ques08m2 {
    //sir ki method hh
    //45ms lgra h;
    public static Boolean isPossible(int x,int arr[],int n){
        int stores=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%x==0){stores+=arr[i]/x;}
            else{stores+=arr[i]/x +1;}
        }
        if(stores>n){return false;}
        else{return true;}
    }
    public static void main(String[] args) {
      // int arr[]={11,6};
        // int n=6; ////ans=3
        int arr[]={100000};
        int n=1;//ans=100000
    
    int m=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx=Math.max(mx,arr[i]);
        }
        int x=0;
        int lo=1 ;
        int hi=mx;
        while (lo<=hi){//time complexity=o(n*log(mx))
            int mid=(lo+hi)/2;
            if(isPossible(mid,arr,n)==true){
               x=mid;
               hi=mid-1;
            }
            else{lo=mid+1;}
        }
        System.out.println(x)   ;
    }
}
