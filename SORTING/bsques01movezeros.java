package SORTING;

public class bsques01movezeros {
    public static void main(String[] args) {
        
   
    // leetcode 283 move zeros
    //we have to move all the zeros to the end in the given array and other elements remains constant and shifted forward..
    
          int arr[]={1,0,2,0,3,4,5};
           int count=0;
           for(int ele:arr){
            if(ele==0){
              count++;
            }
           }
           for(int i=0;i<count;i++){
           for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]==0) 
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        
    }
    for(int ele:arr){
        System.out.print(ele+" ");
    }
}

 }