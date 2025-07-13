package SORTING;

public class Insertionsort {
    public static void main(String[] args) {
        int arr[]={3,5,1,-12,2,12,21,-98};
        int n=arr.length;
        for(int i=1;i<n;i++){
            //m1
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                //m2
                // for(int j=i;j>0&&arr[j]<arr[j-1];j--){
                //     //swap k fn bana skte h
                //         int temp=arr[j];
                //         arr[j]=arr[j-1];
                //         arr[j-1]=temp;
                //  m3
                //standard one..
                // j=i;
                //while(j>0&&arr[j]<arr[j-1]) 
            //{  swap()...;
            // j--;  }
            //while m else ni aegi.. dalna ho dal skte ho.
                else break;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
