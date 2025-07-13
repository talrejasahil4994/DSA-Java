package Cyclesort;

public class ques01m2 {
    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }
    public static int cycle(int arr[],int n){
        int i=0;
         while(i<n){
            if(arr[i]==n|| arr[i]==i){i++;}
          else swap(arr, i, arr[i]);
         
         }
         i=0;
         while(i<n){
           if(arr[i]==n){return i;}  
             else i++;
         }
         return n;
    }
    public static void main(String[] args) {
        int arr[]={0,1};
        int n=arr.length;
      System.out.println(  cycle(arr,n));
       
    }
}
