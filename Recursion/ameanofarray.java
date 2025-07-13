package Recursion;

public class ameanofarray {
    public static void mean(int arr[],int s,int i,int n){
        //my method
        if(i<0){ System.out.println((float)s/n);return;}
        mean(arr, s+arr[i], i-1,n);
    }
    public static float mean2(int arr[],int n){
        //geeks
        if(n==1){return arr[n-1];}
        return ((mean2(arr, n-1)*(n-1)+arr[n-1])/n);
    }
    public static void main(String[] args) {
        int arr[]={5,5,1,1,1};
        int n=arr.length;
        mean(arr, 0, n-1, n);
        float ans=mean2(arr, n);
System.out.println(ans);
    }
}
