package SORTING;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        int n=arr.length;
        //b1 m n-1 to n-1 tk loop jaenge.
        // for(int j=0;j<n-1;j++)//bubble sort not optimised one
      //BUBBLE SORT 2  //
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){//aghr n-i-1 ni likjna h  toh apn i k loop ko 1 to i<=n-1 tk chala sktte h
//     if(arr[j]>arr[j+1]){
//         int temp=0;
//    temp=arr[j];
//    arr[j]=arr[j+1];
//    arr[j+1]=temp;
//     }
//         }}
//BUBBLE SORT 3

for(int i=0;i<n-1;i++){
    boolean check=true;
    for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){//yeh aghr ni run hua if statement then it is clear that the array is sorted.
int temp=0;
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
check =false;
//check vali statement mene phele alag s loop banaya tha sir n or optimal bataya
//mene basic m check wala jo loop h vo lagaya. 
}
}
if(check==true) break; 
}

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
