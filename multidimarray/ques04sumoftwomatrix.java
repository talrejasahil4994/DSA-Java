package multidimarray;

public class ques04sumoftwomatrix {
    public static void main(String[] args) {
        //order of matrix should be same.
   int arr[][]= {{1,2},{2,3}};    
   int brr[][]={{3,4},{6,4}};
   int crr[][]=new int[arr.length][arr[0].length];
   for(int i=0;i<2;i++) {
    for(int j=0;j<2;j++) {
       crr[i][j]= arr[i][j]+brr[i][j];
    }
   }
   //with third matrix.
   for(int i=0;i<2;i++) {
    for(int j=0;j<2;j++) {
      System.out.print(crr[i][j]+" ");
    }
    System.out.println();
   }
   //without 3rd matrix.
   for(int i=0;i<2;i++) {
    for(int j=0;j<2;j++) {
      System.out.print(arr[i][j]+brr[i][j]+" ");
    }
    System.out.println();
   }
}
}
