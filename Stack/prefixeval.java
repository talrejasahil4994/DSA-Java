package Stack;

import java.util.Stack;

public class prefixeval {
    public static void main(String[] args) {
        
    
     String s="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ascii-48);
            }
            else{
//v1 hamesha phle niklega pre k case m
                int v1=val.pop();
                int v2=val.pop();
                if(ch=='+')val.push(v1+v2);
                if(ch=='-')val.push(v1-v2);
                if(ch=='*')val.push(v1*v2);
                if(ch=='/')val.push(v1/v2);
                
            }
        }
        System.out.println(val.peek());
    }
}
