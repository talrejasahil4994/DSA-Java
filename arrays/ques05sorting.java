package arrays;

public class ques05sorting {
    public static void main(String[] args) {
        //two pass solution
        //we have move through array two times.
        int[] arr={0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,};
        // int a=0;
        // int b=0;
        int n=arr.length;
        //method 1 two pass
        // for(int i=0 ;i<arr.length;i++) {
        //     if(arr[i]==0) {
        //         a++;
        //     }
        // }
       
        // for(int i=0;i<n;i++) {
        //    if (i<a){arr[i]=0;}
        //    else{arr[i]=1;}
        // }
        //........ending of one pass.........
        //method 2 ...one pass solution...
        int a=0,b=n-1;
      //while m a<b  chla skta h but a<=b ni 
      //if a=5 and b=5 and at 5th ele is 0
      //so a++ hoga and then aghr a=1 agaya 6th p
      //so swap hogayega gadbad hogi tb
      // 0 0 0 0 0 0 1 1 1 1
      //           ^5th pe a and b dono
      //0 0 0 0 0   0       1 1 1 1 
      //            ^b-5th  ^a-6th   so a=1and b=0 swap will done
      //0 0 0 0 0 1 0 1 1 1...
while(a<b){

if(arr[a]==0)   a++;
if(arr[a]==1 )  b--;
if(a>b) break;// if remove this gives error  if array is already sorted
//because of 4rth condition ex - 0 0 1 1
//                                a^ ^b
//in this a<b from 1st condition= a++ ,2nd=b--,3rd will also run because a know is 1 and is know 0
//it will make array 0 1 0 1 
 if(arr[a]==1&&arr[b]==0) {//&&a<b can add to remove 3rd condition.
//   int temp=0;
//     temp=arr[a];
//     arr[a]=arr[b];
//     arr[b]=temp;
//yeh upr jo kiya voh nadani h saale do values k liy kon temp var banata h
arr[a]=0;
arr[b]=1;
    a++;
    b--;
}

}
       
         for(int ele:arr) {
            System.out.print(ele+" ");
         }
    }
}
