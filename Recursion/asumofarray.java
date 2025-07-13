package Recursion;

public class asumofarray {
    public static void sum(int arr[],int s,int i){
        //my method
        if(i<0){ System.out.println(s);return;}
        sum(arr, s+arr[i], i-1);
    }
    public static int sum2(int arr[],int n){
        //geeks
        if(n<=0){return 0;}
        return (sum2(arr, n-1)+arr[n-1]);
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    sum(arr,0,n-1);
    int ans=sum2(arr, n);
    System.out.println(ans);
}
}
