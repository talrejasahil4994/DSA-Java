package Cyclesort;
public class cyclesort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }
    public static void cycle(int arr[],int n){
        int i=0;
         while(i<n){
          if(arr[i]!=i+1){swap(arr, i, arr[i]-1);}//if(arr[i]!=i){s(arr,i,arr[i])} in case when ele are in 
          //range 0 to n
          else i++;
         }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,4};
        int n=arr.length;
        cycle(arr,n);
        for(int ele:arr){
        System.out.print(ele+" ");}
    }
}
