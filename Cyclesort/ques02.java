package Cyclesort;
public class ques02 {

    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }

    public static int duplicate(int arr[]){
      
    while(true){
         if(arr[0]!=0){
            if(arr[0]==arr[arr[0]]){return arr[0];}
            swap(arr, 0, arr[0]);} 
    }  
    }
    public static void main(String[] args) {
        int arr[]={4,3,3,3,2};
        int n=arr.length;
        int i=duplicate(arr);
        System.out.println(i);
    }
}
