package arrays;
public class ques08nextgreatestelement{
    public static void main(String[] args) {
        //done by me m1
      int[] arr={12,98,75,37,2,49,16,28,21};
      
      int n=arr.length;
      
        // for(int i=0;i<n;i++) {
        //     //nested loop 
        //       int max=0;
        //    for(int j=i+1;j<n;j++) {
            
        //    if(arr[j]>max) max=arr[j];
        //    }
        //    arr[i]=max;  
           
        //   if(i==n-1) arr[n-1]=-1;
        // }
        // for(int ele:arr) {
        //     System.out.print(ele+" ");
        // }
//    ........end of my m1.........


   //sir's method 1-brute force sari ji jaan lga dena 
//    int[] ans=new int[n];
//    ans[n-1]=-1;
//    for(int i=0;i<n-1;i++) {
//     int max=Integer.MIN_VALUE;
//    for(int j=i+1;j<n;j++) {
//     max=Math.max(max,arr[j]);
//    }
//    ans[i]=max;
//    }
//    for (int i : ans) {
//     System.out.print(i+" ");
//    }
// end of sirs m1.................

//method 2-without nested loops
int[] ans=new int[n];
   ans[n-1]=-1;
int nge=arr[n-1];
for(int i=n-2;i>=0;i--) {
    ans[i]=nge;
    nge=Math.max(nge,arr[i]);
}
for (int i : ans) {
        System.out.print(i+" ");
       }

}
} 