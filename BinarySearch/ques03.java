 package BinarySearch;
 import java.util.*;
 public class ques03 {
    public static void main(String[] args) {
        //leetcode69
        Scanner sc =new Scanner(System.in);
       long x=sc.nextInt();
       long lo=0;
        long hi=x;
        long i=0;
        while(lo<=hi){
           long mid=(lo+hi)/2;
            if(mid*mid==x){i=mid; break; }
            else if(mid*mid>x){hi =mid-1;}
            else if(mid*mid<x){lo=mid+1;}
        }
        System.out.println(i);//for normal that have no decimal inn there sqrt 9,16,25
        System.out.println(hi);//for all which have decimal to because hi p loop tutega and vhi shi ans hoga

    }
}
