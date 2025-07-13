package MergeandQuicksort;

public class quickst3 {
    //random pivot point-worst case m bhi O(nlogn) hogi n^2 ni jaegi
    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }
    public static int partition(int arr[],int lo,int hi){
        int mid=(lo+hi)/2;
          int pivot =arr[mid];
          int pidx=mid;
          int count=0;
          for(int i=lo;i<=hi;i++){
            if(arr[i]==pivot)continue;
            if(arr[i]<pivot){count++;}
          }
          int correctidx=lo+count;
          swap(arr,pidx,correctidx);
          //partition
          int i=lo; int j=hi;
          while(i<correctidx&&j>correctidx){
            if(arr[i]<=pivot){i++;}
           else if(arr[j]>pivot){j--;}
           else if(arr[i]>pivot&&arr[j]<pivot){
                swap(arr, i, j);
            }
          }
           return correctidx;
    }
    public static void quick(int arr[],int lo,int hi){
     if(lo>=hi){return;}//when length=1; //equals to wali condition jaruri ni h isme but vo fir 1 size k array k bhi partition hoga
        int idx= partition(arr,lo,hi);
        quick(arr, lo, idx-1);
        quick(arr,idx+1,hi);

    }
       
    public static void main(String[] args) {
        int arr[]={3,3,3,3,2,3,3,3,3};
       
        int n=arr.length;
     quick(arr, 0, n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
