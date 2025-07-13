package Recursion;

public class arraytraverse {
    public static void traverse(int arr[],int i) {
       
       if(i<0){return;}
          traverse(arr,i-1);
         System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        traverse(arr,n-1);
    }
}
