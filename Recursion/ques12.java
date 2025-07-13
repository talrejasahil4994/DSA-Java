package Recursion;
import java.util.*;
public class ques12 {
public static void print(String ans,int n){
    if(ans.length()==n){
        System.out.println(ans);
        return;
    }
    if(ans.length()==0||ans.charAt(ans.length()-1)=='0'){
        print(ans+0, n);
        print(ans+1, n);
    }
    else{print(ans+0, n);}

}
    //generate all binary strings of length n without consecutive 1's.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print("",n);
    }
}
