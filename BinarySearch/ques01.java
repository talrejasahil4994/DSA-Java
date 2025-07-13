package BinarySearch;

public class ques01 {
    public static void main(String[] args) {
        //leetcode 34- find first and last position of element in a given array .
    //method 1
    //first we have check through binary search that the given ele is present in array or not
    //then if present then we have to find lowerbound for first positon and upperbound -1 for  last position 
    
    int arr[]={1,5,5,5,5};
    int target=5;
    int n=arr.length;
        
    int ans[]={-1,-1};
    int low=0;
    int high=n-1;
    boolean flag=false;
    
    while(low<=high){
        int mid=(low+high)/2;
       if(arr[mid]==target) {
        flag=true;
        break;
        }
        else if(arr[mid]<target) {low=mid+1; }
        else if(arr[mid]>target){ high=mid-1;}
        
    }
    if(flag==false){
        for (int i : ans) {
             System.out.print(i+" ");
        }
    }

      low=0;
    high=n-1;
    int lb=n;

    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>=target){
            lb=Math.min(mid, lb);
            high=mid-1;
        }
        else{low=mid+1;}
       
    }
  

     low=0;
     high=n-1;
    int up=n;

    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>target){
            up=Math.min(mid, up);
            high=mid-1;
        }
        else{low=mid+1;}
       
    }
    if(flag==true){
        ans[0]=lb;
        ans[1]=up-1;
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    
}
}