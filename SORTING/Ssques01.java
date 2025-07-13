package SORTING;

public class Ssques01 {
    public static void main(String[] args) {
        //arrange or sort in decreasing order...
        int arr[]={3,15,12,-1,0};
        int n=arr.length;
        int idx=0;
        for(int i=0;i<arr.length-1;i++){
             int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length-i;j++){
               
                if(arr[j]<min){
                   min=arr[j];
                idx=j;
                } 
               
            }
             int temp=arr[n-1-i];
                arr[n-1-i]=min;
                arr[idx]=temp;
        }
        for (int i : arr) {
             System.out.print(i+" ");
        }
    }
}
