package MergeandQuicksort;

public class ques01 {
    //leetcode 496 hard
    //reverse pairs 
//     Given an integer array nums, return the number of reverse pairs in the array.
// A reverse pair is a pair (i, j) where:
// 0 <= i < j < nums.length and
// nums[i] > 2 * nums[j].
// Example 1:
// Input: nums = [1,3,2,3,1]
// Output: 2
// Explanation: The reverse pairs are:
// (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
// (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
static int count=0;
public static void mergetwosortedarray(int a[],int b[],int arr[]){
int n=a.length;
int m=b.length;
int i=0; int j=0; int k=0;
while(i<n&&j<m){
    if(a[i]<=b[j]){
        arr[k++]=a[i++];
    }
    else{ arr[k++]=b[j++];}
}
while(j<m){arr[k++]=b[j++];}
while(i<n){arr[k++]=a[i++];}
}
public static void inversioncount(int a[],int b[]){
int i=0;
int j=0;
while(i<a.length&&j<b.length){
if((long)a[i]>(2*(long)b[j])){
    count+=a.length-i;
    j++;
}
else i++;
}
}
public static void mergesort(int arr[]){
int n=arr.length;
if(n==1) return;//BASE CASE
int a[]=new int[n/2];
int b[]=new int[n-n/2];
for(int i=0;i<n/2;i++){
  a[i]=arr[i];
}
for(int i=0;i<n-n/2;i++){
b[i]=arr[i+n/2];
}
//magic
mergesort(a);
mergesort(b);
inversioncount( a, b);
mergetwosortedarray( a, b, arr);
a=null; b=null;//s.c =o(n)

}
public static int reversePairs(int[] nums) {
    count=0;
    mergesort(nums);
    return count;
}
public static void main(String[] args) {
    int arr[]={1,3,2,3,1};
    reversePairs(arr);
    System.out.println(count);
}
}
