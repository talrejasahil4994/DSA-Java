package Recursion;

import java.util.ArrayList;
import java.util.List;

class ques09 {
    //leetcode 78
//Given an integer array nums of unique elements, return all possible 
//subsets
//(the power set).

//The solution set must not contain duplicate subsets. Return the solution in any order.
    static List<List<Integer>> arr;
    public static void sub(int nums[], ArrayList<Integer> ans,int i){
        int n =nums.length;
        if(i==n){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            } 
            arr.add(list);
            return;}
        sub(nums,ans,i+1);
        ans.add(nums[i]);
        sub(nums,ans,i+1);
        ans.remove(ans.size()-1);
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        arr=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        sub(nums,ans,0);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2};
        
        List<List<Integer>> list=new ArrayList<>();
        list=subsets(arr);
        System.out.println(list);
    }
}
