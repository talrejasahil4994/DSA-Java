package Cyclesort;
class ques04 {
    //leetcode 41
    //find missing positive 
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
       arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int firstMissingPositive(int[] arr) {
        int n=arr.length;
        //jarvat ni h last m n+1 ki jagah i+1 return krdo
        // if(n==1){
        //     if(arr[0]<=0) return 1;
        //    else if(arr[0]==1) return 2;
        //    else{return 1;}}

        int i=0;
       while(i<n){
            if(arr[i]<=0 || arr[i]>n  ||arr[i]==arr[arr[i]-1] ){i++;}//||arr[i]==i+1 ak ye condition sir n batae ki
            //aghr shi jagah rakha toh age bado but ye toh ye bhi check kra h
            //arr[i]==arr[arr[i]-1] arr[0]==arr[1-1] , 1==1 shi h so sir vli condition ki jarvat ni h.
            else{swap(arr,i,arr[i]-1);}
        }
        i=0;
        while(i<n){
        if(arr[i]==i+1){i++;}
        else{return i+1;}
        }
      return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1};
       System.out.println( firstMissingPositive(arr));
       for(int ele:arr){
        System.out.print(ele+" ");
       }
    }
}
    

