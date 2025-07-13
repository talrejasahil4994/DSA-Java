package SORTING;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        
        int idx=0;
        for(int i=0;i<arr.length-1;i++){
             int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
               
                if(arr[j]<min){
                   min=arr[j];
                idx=j;
                } 
               
            }
             int temp=arr[i];
                arr[i]=min;
                arr[idx]=temp;
        }
        for (int i : arr) {
             System.out.print(i+" ");
        }
       

    }
}
