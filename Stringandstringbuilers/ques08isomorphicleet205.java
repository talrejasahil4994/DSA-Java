package Stringandstringbuilers;
import java.util.*;

public class ques08isomorphicleet205{
    public static void main(String[] args) {
        //leetcode205
       String s="mohd";
    String t="race";
                if(s.length()!=t.length()) System.out.println("false");;
               char arr[]=new char[128];//'\0'
               for(int i=0;i<s.length();i++){
                  char ch=s.charAt(i);
                  char dh=t.charAt(i);
                  int idx=(int)ch;
                  if(arr[idx]=='\0'){
                    arr[idx]=dh;
                  } else if(arr[idx]!=dh) {
                    System.out.println("false1");
                  }
               }
               for (int i=0;i<arr.length;i++){
                arr[i]='\0';
               }
             for(int i=0;i<s.length();i++){
                  char ch=t.charAt(i);
                  char dh=s.charAt(i);
                  int idx=(int)ch;
                  if(arr[idx]=='\0'){
                    arr[idx]=dh;
                  } else if(arr[idx]!=dh) {
                    System.out.println("false2");
                  }
                  
               }
           System.out.println("true if no false uppr");
        
}
}