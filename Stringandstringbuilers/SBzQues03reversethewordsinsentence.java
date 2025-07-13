package Stringandstringbuilers;
import java.util.*;
public class SBzQues03reversethewordsinsentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        int i=0;
        int j=0;
        //write code but we can modify it by adding loop in 14 or 15 line by checking i ==' 'then take it everwhere the next character is coming.
        while(j!=n){
        if(sb.charAt(j)==' '){
            Reverse(i, j-1, sb);
            i=j+1;
            j=i;
        }
        else j++;
        
        }
     
       
        Reverse(i, n-1, sb);
       

    //  for(int i=0;i<n;i++){
    //     if(sb.charAt(i)==' '){
    //         Reverse(k, i-1, sb);
    //         k=i+2;
    //     }
    
    //  }
     System.out.println(sb);
        }
    
    public static void Reverse(int i,int j,StringBuilder sb) {
   
     
      while(i<=j){
        char temp=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
        i++;
        j--;
    }
}
}
