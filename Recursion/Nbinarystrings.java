package Recursion;

import java.util.Scanner;

public class Nbinarystrings {
    public static void print(String ans,int n){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
       
            print(ans+0, n);
            print(ans+1, n);
        
   
    
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print("",n);
    }
}
