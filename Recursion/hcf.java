package Recursion;
import java.util.*;
public class hcf {
    public static int HCF(int a,int b){//O(min of two no)
        for(int i=Math.min(a, b);i>0;i--){
                if(a%i==0&&b%i==0)return i;
            }
           return 1; 
        }
        public static int GCD(int a,int b){//O(log)
            if(b%a==0){return a;}
           return  GCD(b%a, a);
        }
        
   
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);

    
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("tc-O(minofa and b) ans= "+HCF(a, b));//time complex O(minoftwonos)
    System.out.println("TC-logrithmic ans=  "+GCD(a,b));
   
}
}
 