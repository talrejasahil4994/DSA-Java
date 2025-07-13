package Recursion;

public class ques10 {
    //print all increasing sequences of length k from first n natural numbers
    public static void print(String str,int k,int n,String ans,int i){
        if(ans.length()==k){
            System.out.println(ans);
            return ;
        }
        if(i==n){return ;}
        print(str, k, n, ans+str.charAt(i),i+1);
        print(str, k, n, ans, i+1);
    }
    public static void main(String[] args) {
      String str="123456";
      int k=4;
      int n=str.length();
        print(str,k,n,"",0);
    }
}
