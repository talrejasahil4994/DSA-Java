package Stringandstringbuilers;
import java.util.*;
public class SBzQues01smallcharttocapviceversa {
    public static void main(String[] args) {
        //toggle characters....
        //input a string and toggle all the character
        //of it .(replace smaill case with capital case &vice versa)
         Scanner sc=new Scanner (System.in);
      
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        for(int i=0;i<n;i++){
            char ch;
            ch=sb.charAt(i);
            int x=(int)ch;
            if(x>=65 && x<=90){
             x=x+32;
             sb.setCharAt(i, (char)x);
            
            }
            else if(x>=97 && x<=122){
                x=x-32;
                sb.setCharAt(i, (char)x);
               }
               // sb.setCharAt(i, (char)x); ve chiz bhr bhi likh skte h because else if m same chiz hori h last m
        }
        System.out.println(sb);
       

    }
}
