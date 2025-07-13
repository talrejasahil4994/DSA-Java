package Recursion;

public class ques02 {
    //calculate a raise to power b by recursion
    public static int power(int a,int b){
        if(a==0) return 0;//if not present gives 1 0n 0to the power 0
        if(b==0)  return 1; 
    
    return a*power(a, b-1);
    }
    public static void main(String[] args) {
        int i=power(2,3);
   
   System.out.println(i); }
}
