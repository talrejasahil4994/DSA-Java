package Stack;

import java.util.Stack;

public class pretoinfix {
    public static void main(String[] args) {
        
    
     String s="-9/*+5346";
        Stack<String> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ch+"");
            }
            else{
//v1 hamesha phle niklega pre k case m
                String v1=val.pop();
                String v2=val.pop();
               val.push("("+v1+ch+v2+")");
                
            }
        }
        System.out.println(val.peek());
    }
}
