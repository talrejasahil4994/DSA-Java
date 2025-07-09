package arrays;
import java.util.*;
public class ques04method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,10,20,30,40,50,60,70};
        int n=arr.length;
        int k=sc.nextInt();
            k=k%n;
            
            int i=0,j=n-k-1;//sir n krava tha ki jitna no daloge utne nos piche s agge rotate 
            // hote jaenge 1 2 3 4 m 1 dal toh 4 1 2 3 aega
        //    int i=0,j=k-1;//us index s jo daloge rotate hojaega 1,2 ,3,4 m 1 dala toh 2 3 4 1
           System.out.println(j);
            while(i<=j) {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               
               i++;
               j--;
            }
            i=n-k; j=n-1;
            // i=k; j=n-1;
             while(i<=j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i++;
                j--;
             }
             i=0; j=n-1;
             while(i<=j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i++;
                j--;
             }
        
        //   reverse(0, n-k-1, arr);
        //   reverse(n-k, n-1, arr);
        //   reverse(0, n-1, arr);

        System.out.println();
        for(int ele:arr) {
            System.out.print(ele+" ");
        }

    }
    public static void reverse(int i,int j,int[] arr) {
        while(i<=j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i++;
                j--;
    }
  

}

}