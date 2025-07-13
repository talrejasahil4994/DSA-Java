package SORTING;

public class bsques02 {
    public static void main(String[] args) {
        //arrange or sort the array in decreasing order.
        int arr[]={1,2,10,4,5};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
                        for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=0;
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
                }
                    }}
                    for(int ele:arr){
                        System.out.print(ele+" ");
                    }
    }
}
