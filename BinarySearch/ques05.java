package BinarySearch;
import java.util.*;
public class ques05 {
    public static void main(String[] args) {
        //leecode658 find k closest elements
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,8};
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int left=0;
        int right=n-1;
        while((right-left)>=k){
            if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){left++;}
            else{right--;}
        }
        for(int i=left;i<=right;i++){
            ans.add(arr[i]);
        }
        System.out.println(ans);
    }
}
