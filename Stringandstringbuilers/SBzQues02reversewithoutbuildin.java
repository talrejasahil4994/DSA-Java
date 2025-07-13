package Stringandstringbuilers;
import java.util.*;
public class SBzQues02reversewithoutbuildin {
    public static void main(String[] args) {
        //reverse a stringbuilder without using the buildin method.
       Scanner sc=new Scanner(System.in);
       StringBuilder sb=new StringBuilder(sc.nextLine());
      int n=sb.length();
      int i=0;
      int j=n-1;
      while(i<=j){
        char temp=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
        i++;
        j--;
      }
      System.out.println(sb);
    }
}
