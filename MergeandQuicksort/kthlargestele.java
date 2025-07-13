package MergeandQuicksort;
public class kthlargestele {//leetcode215
    static int ans=0;
  
    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }
    public static int partition(int arr[],int lo,int hi){
          int pivot =arr[lo];
          int pidx=lo;
          int count=0;
          for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot){count++;}
          }
          int correctidx=pidx+count;
          
          swap(arr,pidx,correctidx);
         
          //partition
          int i=lo; int j=hi;
          while(i<correctidx&&j>correctidx){
            if(arr[i]<=pivot){i++;}
           else if(arr[j]>pivot){j--;}
           else if(arr[i]>pivot&&arr[j]<=pivot){//code leetcode p isliye ni chlra tha kyu ki arr[j wale case m]<laga tha jbki <=
            //<=chaiye kiyo ki same ele agaye toh swap hone m dikkat hogi llike 3 3 3 3 4 3 3 3 3
            //3i 3 3 3 4 3 _3_ 3j
            //4 or 3 swap hone ke liye <= jaruri h
                swap(arr, i, j);
            }
          }
           return correctidx;
    }
    public static void quickselect(int arr[],int lo,int hi,int k){
        
     if(lo>=hi){ if(lo==k-1){ans=arr[hi];} //equals to wali condition jaruri ni h isme but vo fir 1 size k array k bhi partition hoga
     return;}//when length=1;
        int idx= partition(arr,lo,hi);
        if(k==idx+1){ ans=arr[idx]; return;}//k-1==idx
        if(k<idx+1)//k-1<idx
        quickselect(arr, lo, idx-1,k);
        else
        quickselect(arr,idx+1,hi,k);
    

    }
       
    public static void main(String[] args) {
       
        int arr[]={3,3,3,3,4,3,3,3,3};
       int k=1;
        int n=arr.length;
     quickselect(arr, 0, n-1,n-k+1);//normal k pass krengre toh k smallest nikl dega
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("\n"+ans);
    }
}
