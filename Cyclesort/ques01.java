package Cyclesort;
//leetcode 268 missing no without cycle sort
public class ques01 {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        boolean arr[]=new boolean[n+1];
        for(int ele:nums){
            arr[ele]=true;
        }
        for(int i=0;i<n+1;i++){

            if(arr[i]==false){
                return i;
            }
        }
    return -1; }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,0};
        for(int ele:arr)
       {System.out.print(ele+" ");}
       System.out.println("\n"+"missing no-" +missingNumber(arr));
    }
}
