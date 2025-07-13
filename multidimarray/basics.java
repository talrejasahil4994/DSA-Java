package multidimarray;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int m=arr.length;//no of rows
        int n=arr[0].length;//no of columns
        System.out.println(m+" "+n);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }  
        }
        // for(int i=0;i<m;i++) {
        //     for(int j=0;j<n;j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
       //for each loop in 2d arrays
       for(int[] ele:arr) {
        for(int x:ele) {
            System.out.print(x+" ");
        }
        System.out.println();
       }
      
    }
}
