package multidimarray;
import java.util.*;
public class ques07rotateby90degrees {
    public static void main(String[] args) {
        //rotate image q48 on leet code.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
         
         
          for(int i=0;i<n;i++) {
              for(int j=0;j<n;j++) {
                  arr[i][j]=sc.nextInt();
              }  
          }
          System.out.println("Your matrix is:");
          //normal matrix
  
          for(int i=0;i<n;i++) {
                  for(int j=0;j<n;j++) {
                      System.out.print(arr[i][j]+" ");
                  }
                  System.out.println();
              }

           
            System.out.println("rotate 90degree:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<i;j++)//here we can also use <=
                 {
                  
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                   
                }
           }
           //my chutiya dimag....
    //        for(int i=0;i<n;i++) {
    //         for(int j=0;j<n;j++)
    //          {
    //           if(j==0){
    //             int temp=arr[i][0];
    //             arr[i][0]=arr[i][2];
    //             arr[i][2]=temp;
    //           }
              
               
    //         }
    //    }
    //sir n bataya...
//mene kiya..

    for(int i=0;i<n;i++){

    int a=0,b=n-1;
    while(a<=b) {
      swap(arr[i], a, b);
      a++;
      b--;
    
    }}
//sir ki method
// for(int i=0;i<n;i++) {
//     int a=0,b=n-1;
//     while(a<=b) {
// int temp=arr[i][a];
// arr[i][a]=arr[i][b];
// arr[i][b]=temp;

//         a++;
//         b--;
      
//   }
// }
    
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

    }
    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
