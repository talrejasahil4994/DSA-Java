package Recursion;

public class ques03 {
    //leetcode509
    //find nth fibonacci no.
    public static int fib(int n) {
        //if(n<=1){return n;}
        if(n==0){return 0;}
        if(n==1){return 1;}
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int i=fib(6);
        System.out.println(i);

    }
}
