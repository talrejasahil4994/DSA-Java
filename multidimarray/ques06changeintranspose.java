package multidimarray;
import java.util.*;
public class ques06changeintranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
          int n=sc.nextInt();//no of columns
          //write a program to change the matrix with its transpose.
          //only possible n square matrix 2*2 3*3like
          int[][] arr=new int[m][n];
         
         
          for(int i=0;i<m;i++) {
              for(int j=0;j<n;j++) {
                  arr[i][j]=sc.nextInt();
              }  
          }
          System.out.println("Your matrix is:");
          //normal matrix
  
          for(int i=0;i<m;i++) {
                  for(int j=0;j<n;j++) {
                      System.out.print(arr[i][j]+" ");
                  }
                  System.out.println();
              }
              int brr[][]=new int[m][n];
              for(int j=0;j<n;j++) {
                 for(int i=0;i<m;i++){
                    brr[i][j]=arr[j][i];
                }  
            }
            
                for(int i=0;i<m;i++)
                { for(int j=0;j<n;j++){
                   arr[i][j]=brr[i][j];
               }  
           }
            System.out.println("Transpose of that matix is:");
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        
    }
}
