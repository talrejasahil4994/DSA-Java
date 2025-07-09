package arrays;
import java.util.*;
public class inpout{
    public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        int n=scc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        arr[i]=scc.nextInt();
        }
        for(int i=0;i<n;i++) {
      System.out.println(arr[i]);            }
    }
}