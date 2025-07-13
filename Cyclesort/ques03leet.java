package Cyclesort;
import java.util.*;
public class solution {
    static ArrayList<Integer> ans=new ArrayList<>();
     public  static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
       arr[ i]=temp;
    }
     public  static void disappear(int arr[],int n){
      int i=0;
        while(i<n){
             if(arr[i]!=i+1){
                if(arr[i]==arr[arr[i]-1]){i++;}
                else swap(arr, i, arr[i]-1);
                } 
                else{i++;}
        }  
        for( i=0;i<n;i++){
         if(arr[i]!=i+1){
          ans.add(i+1);
         }
        } 
        }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        disappear(nums,n);
        return ans;
   

   
 }
 public static void main(String[] args) {
   int arr[]={1,1};
   findDisappearedNumbers(arr); 
   System.out.println(ans);
 }
}