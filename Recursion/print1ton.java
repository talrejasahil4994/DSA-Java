package Recursion;
import java.util.*;
public class print1ton {
    static int i;
    //void m banaya h int m bhi kr sakte h 
    //return 0; if me and print k age bhi return
    //like in nto 1;
    //m2
    //psvp(int n,int i) //static variable hata do//extra parameter lagega
    public static void print(int n){
         if(n>i){return;}//base case
         System.out.println(n); //work
        print(n+1);//call
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        i=sc.nextInt();    
        //m2
        //int i=sc.nextInt();
        //print(1,i);
        print(1);
    }
}
