package BinarySearch;

public class ques06 {
    public static void main(String[] args) {
        
    
    //leetcode1283 find the smallest divisor given a threshold
    //time complexity is o(n*mx)
    int arr[]={5,1,9,2};
    int t=6;
    int n=arr.length;
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
       mx= Math.max(mx,arr[i]);
    }
    int d;
    for(d=1;d<=mx;d++){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%d==0) {sum+=arr[i]/d;}
            else {sum+=arr[i]/d + 1;}
        }
        if(sum<=t){System.out.println(d+" success"); break;}
    }
    System.out.println("fail");

}
}
