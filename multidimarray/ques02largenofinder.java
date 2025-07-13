package multidimarray;
import java.util.*;
public class ques02largenofinder {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[2][2];
    for(int i=0;i<2;i++) {
        for(int j=0;j<2;j++) {
          arr[i][j]=sc.nextInt();
        }
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<2;i++) {
        for(int j=0;j<2;j++) {
          if(arr[i][j]>max) {
           max=Math.max(max,arr[i][j]);
          }
        }
    }
    System.out.println("Maxmimum value in 2darrays - "+max);



}
}
