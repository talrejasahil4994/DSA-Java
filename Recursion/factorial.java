package Recursion;
import java.util.*;
public class factorial {
    public static int fact(int i){
         
      if(i==0){//also i==1 base case but zero k liye error dega
        return 1;}
      return i*fact(i-1);//call
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        int i=fact(j);
        System.out.println(i);
    }
}
