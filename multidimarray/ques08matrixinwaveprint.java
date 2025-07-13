package multidimarray;

import java.util.Scanner;

public class ques08matrixinwaveprint {
    public static void main(String[] args) {
        //ROW WISE ALTERNATE PRINTING OR IN A WAVE FORM.
        //1___2___3__
        //           |
        //4____5__6__|
        //|
        //|_7___8___9       in 3*3 matrix - 1 2 3 6 5 4 7 8 9 
         Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
          int n=sc.nextInt();
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
              //print in wave form
              for(int i=0;i<m;i++) {
               
                    if(i%2==0) { for(int j=0;j<n;j++)
                     {
                        System.out.print(arr[i][j]+" ");
                    }}
                    else{for(int j=n-1;j>=0;j--)
                        {
                           System.out.print(arr[i][j]+" ");
                       }}
                
               
            }
    }
}
