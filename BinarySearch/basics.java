package BinarySearch;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        
        int target=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean flag=false;
        int pass=1;
        while(low<=high){
            System.out.println("....pass....:"+pass);
            int mid=(low+high)/2;
            //if low+hi/2 gives error of integer overflow because int ki aukat h -2^31to2^31
            //if no bada hua low+hi =range k bhr gaya toh error a sakta h kyoki phele lo +hi calculate hoga
            //isko avoid krn k liye
            //we use int mid=low+(high-low)/2
            System.out.println("mid:"+mid);
           if(arr[mid]==target) {flag=true; break;}
            else if(arr[mid]<target) {low=mid+1; System.out.println("low:"+low);}
            else if(arr[mid]>target){ high=mid-1; System.out.println("high:"+high);}
            pass=pass+1;
        }
        System.out.println(flag);
    }
}
