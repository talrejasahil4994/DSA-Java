package multidimarray;
import java.util.*;
public class ques06m2 {
    public static void main(String[] args) {
        //transform into tranpose
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
              //MY swaping method
            //   for(int i=0;i<n;i++) {
            //     for(int j=0;j<n;j++) {
            //        if(i<j) {
            //         int temp=arr[i][j];
            //         arr[i][j]=arr[j][i];
            //         arr[j][i]=temp;
            //        }
            //     }
          //  }
          //SIR KI EFFICIENT WALI LOOP JADA KYU CHALU
          for(int i=0;i<n;i++) {
                for(int j=0;j<i;j++)//here we can also use <=
                 {
                  
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                   
                }
           }
            System.out.println("TRANSPOSE:");
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
