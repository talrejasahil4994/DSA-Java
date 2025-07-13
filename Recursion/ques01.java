package Recursion;
import java.util.*;
public class ques01 {
   // static int i;
//     public static void sum(int n){
//         if(n==0){return;}
//         sum(n-1);
//         i=i+n;
        
//    }
//m2 sir n bataya
public static void sum(int n,int s){
    if(n==0){//base case
        System.out.println(s);
        return ;
    }
    sum(n-1,n+s);//call and work
}
    //print sum form 1ton ..parameterised sum
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
         int s=0;
        sum(n,s);
       
    }
}
