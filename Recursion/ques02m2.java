package Recursion;

public class ques02m2 {
    public static int power(int a,int b){
        if(a==0) return 0;//if not present gives 1 0n 0to the power 0
        if(b==0)  return 1; 
        int ans=power(a, b/2);
    if(b%2==1){ return ans*ans*a; }
    return ans*ans;
    }
    public static void main(String[] args) {
        int i=power(4,5);
   
   System.out.println(i); }
}
