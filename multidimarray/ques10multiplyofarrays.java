package multidimarray;
import java.util.*;
public class ques10multiplyofarrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
       int a[][]=new int[m][n];
       int p=n;
       System.out.println("so as we know p=n and enter q:");
       int q=sc.nextInt();
       int b[][]=new int[p][q];
       System.out.println("Enter the elements of 'a' matrix :");
       for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
        }
       }
       System.out.println("Enter the elements of 'b' matrix :");
       for(int i=0;i<p;i++) {
        for(int j=0;j<q;j++){
            b[i][j]=sc.nextInt();
        }
       }
       int c[][]=new int[a.length][b[0].length];
       
       for(int i=0;i<c.length;i++){
       
        for(int j=0;j<c[0].length;j++){
           // int sum=0;
            for(int k=0;k<a[0].length;k++){
            //   sum=sum+a[i][k]*b[k][j];
              c[i][j]+=a[i][k]*b[k][j];
            }
            //c[i][j]=sum;
           //print iske andar bhi kr skte h
        }
       }
       System.out.println("C matrix ::");
       for(int ele[]:c){
        for(int x:ele){
            System.out.print(x+" ");
        }
        System.out.println();
       }


    }
}
