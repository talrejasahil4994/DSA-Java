package multidimarray;
import java.util.*;
public class ques03sumofmatrix {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
              arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
            sum=sum+arr[i][j];              
            }
        }
        System.out.println("sum of elements of 2darrays - "+sum);
    
    }
     
}
