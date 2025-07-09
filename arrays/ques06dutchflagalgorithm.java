package arrays;

public class ques06dutchflagalgorithm {
    public static void main(String[] args) {
      //sort the array of os 1s 2s.
      //m_1 two pass solution
      int[] arr={2,2,2,2,2,2,2,2,2,0,1};
      int n=arr.length;
    //   int zeros=0;
    //   int ones=0;
    //   for(int i=0;i<n;i++) {
    //     if(arr[i]==0)  zeros++;
    //      if(arr[i]==1) ones++;
    //   }
    //   for(int i=0;i<n;i++) {
    //     if(i<zeros){ arr[i]=0;}
    //   else  if(i<ones+zeros) {arr[i]=1;  }
    //    else {arr[i]=2; }
    //   }
    //   for(int ele:arr){
    //     System.out.print(ele+" ");
    //   }
    //   System.out.println();
     //

//method 2 dutch flag algorithm one pass
int low=0;
int mid=0;
int high=n-1;
while(mid<=high) {
    if(arr[mid]==0){
        int temp=arr[low];
        arr[low] =arr[mid];
        arr[mid]=temp;
        low++;
        mid++;
    }
   else if(arr[mid]==1) {
        mid++;
    }
    else if(arr[mid]==2){
        int temp=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp;
        high--;
    }
}
for(int i:arr) {
    System.out.print(i+" ");
}
     }
}
