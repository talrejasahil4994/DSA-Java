package Recursion;
import java.util.*;
public class ques01m2 {
    public static int sum(int n) {
        if(n==0||n==1){return n;}//0 tk sum 0 hoga and 1 tk 1 hoga.
        return n+sum(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int i= sum(n);
       System.out.println(i);
    }
}
