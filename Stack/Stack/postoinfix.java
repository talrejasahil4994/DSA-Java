package Stack;

import java.util.Stack;

public class postoinfix {
     public static void main(String[] args) {
        
    
     String s="953+4*6/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ch+"");
            }
            else{
//v2 hamesha phle niklega postfix k case m
                String v2=val.pop();
                String v1=val.pop();
               val.push("("+v1+ch+v2+")");
                
            }
        }
        System.out.println(val.peek());
    }
}
