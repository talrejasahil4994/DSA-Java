package arrays;
public class ques03reversearray {
    //write a program to reverse the array without using the extra array.
public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60,70};
int n=arr.length;
for (int ele:arr) {
    System.out.print(ele+" ");
}
System.out.println();
//reverse
//method 1
    // for(int i=0;i<n/2;i++) {
    // int j=n-1-i;
    //   int temp =arr[i];
    //       arr[i]=arr[j];
    //       arr[j]=temp;
    // }
     //method 2
     //we can reverse a part of array by just 
     //int i=1,j=5;
     int i=0,j=n-1;
     while(i<=j) {
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        //we can alsouse function to swap arrays because 
        //we know that array is pass by reference 
        swap(arr, i, j);
        i++;
        j--;
     }
    for (int ele:arr) {
        System.out.print(ele+" ");
    }
    System.out.println();

}
public static void swap(int[] arr,int i,int j) {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
