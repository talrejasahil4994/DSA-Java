package multidimarray;
import java.util.*;
public class ques05transposeofmatrix {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
        int n=sc.nextInt();//no of columns
        //write a program to print transpose OF the matrix entered by the user and store it in new matrix.
        
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
            System.out.println("Transpose of that matrix is:");
            //transpose or column wise printing.
            //first i have just printed the normal transpose by outer 
           // loop j and inner i and then i form matrix to fill it
        int brr[][]=new int [n][m];
         for(int j=0;j<n;j++){
                 for(int i=0;i<m;i++){
                  brr[j][i]=arr[i][j];
                }
            }
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }
           






    }
}
