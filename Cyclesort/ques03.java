package Cyclesort;
import java.util.ArrayList;
import java.util.List;

public class ques03 {
    //leetcode 448. Find All Numbers Disappeared in an Array
      public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
         boolean b[]=new boolean[nums.length];
         for(int i=0;i<nums.length;i++){
            b[nums[i]-1]=true;
         }
           for(int i=0;i<nums.length;i++){
           if(b[i]==false){ans.add(i+1);}
         }
   return ans; }
   public static void main(String[] args) {
    int arr[]={1,4,2,6,5,8,9,4,4};
    System.out.println(findDisappearedNumbers(arr));
   }
}
