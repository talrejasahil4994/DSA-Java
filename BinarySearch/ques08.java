package BinarySearch;

public class ques08 {
    //leetcode 2064 minimized-maximum-of-products-distributed-to-any-store
    //this code is done by me and sir k code m2 method m hoga
    //isme mujhe 124ms lag raha h
    //time complexity=o(n*log(mx))
    public static Boolean isPossible(int x,int arr[],int n){
        int load=0;
        int stores=0;
        for(int i=0;i<arr.length;i++){
            load=arr[i];
            while(load>0){
                if(load>=x){load-=x; stores++;}
                else{load=0; stores++;}
            }
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
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(mid,arr,n)==true){
               x=mid;
               hi=mid-1;
            }
            else{lo=mid+1;}
        }
        System.out.println(x);
    }
}
