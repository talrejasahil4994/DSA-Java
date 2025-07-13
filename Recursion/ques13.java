package Recursion;
import java.util.*;
//leetcode 22 generate perenthesis 
public class ques13 {  static List<String> ans=new ArrayList<>();
    public static void print(String str,int n,int open,int close){
         if(str.length()==2*n){ans.add(str); return;}
         
        
         if(open<n){
            print(str+'(',n,open+1,close);
           
         }
         if(close<open){
            print(str+')',n,open,close+1);
           
         }
    }
        public static List<String> generateParenthesis(int n) {
            String str="";
            print(str,n,0,0);
             return ans;
        }
        public static void main(String[] args) {
            List<String> list=new ArrayList<>();
            list=generateParenthesis(3);
            System.out.println(list);
        }
    }
