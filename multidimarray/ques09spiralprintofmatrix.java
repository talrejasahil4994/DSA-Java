package multidimarray;
import java.util.*;
public class ques09spiralprintofmatrix {
    public static void main(String[] args) {
        

    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
      int n=sc.nextInt();
      int arr[][] =new int[m][n];
     
     
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
          //spiral printing
          System.out.println("Spiral print :");
          int minr=0;
          int maxr=m-1;
          int minc=0;
          int maxc=n-1;
          while(minr<=maxr && minc<=maxc) {
         //left to right
         for(int j=minc;j<=maxc;j++) 
         { 
            
            System.out.print(arr[minr][j]+" ");
           
         }
         minr++;
         //break ki gagah jese 15 element ane wale h jese hi print hojae loop band krdo.
         if(minr > maxr||minc>maxc) break;

          //top to bottom
         for(int i=minr;i<=maxr;i++)
        {
         
            System.out.print(arr[i][maxc]+" ");
           
        }
        maxc--;
        //right to left
        if(minr > maxr||minc>maxc) break;

        for(int j=maxc;j>=minc;j--) {
          
            System.out.print(arr[maxr][j]+" ");
           
        }
        maxr--;
        //bottom to top
        if(minr > maxr||minc>maxc) break;

        for(int i=maxr;i>=minr;i--) {
        
         System.out.print(arr[i][minc]+" ");
        }
        minc++;
          }

}
}