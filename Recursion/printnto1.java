package Recursion;
import java.util.*;
public class printnto1 {
    public static int print(int n){
       if(n==0) return 0;
  System.out.println(n);
  return print(n-1);
        
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        int i=sc.nextInt();
      print(i);
    
    }
}
