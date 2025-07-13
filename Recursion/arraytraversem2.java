package Recursion;

public class arraytraversem2 {
    public static void traverse(int arr[],int i) {
       
        if(i==arr.length){return;}
          System.out.println(arr[i]);
           traverse(arr,i+1);
     }
     public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         traverse(arr,0);
     }
}
