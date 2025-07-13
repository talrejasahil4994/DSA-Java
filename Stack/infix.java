package Stack;
import java.util.Stack;


public class infix {
    public static void main(String[] args) {
        Stack<Integer> no=new Stack<>();
        Stack<Character> op=new Stack<>();
        String s="9-(5+3*5-2)*4/6";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                no.push(ascii-48);
            }
            else if(op.size()==0||ch=='('||op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                    while(op.peek()!='('){
                        int v2=no.pop();
                    int v1=no.pop();
                    if(op.peek()=='+'){no.push(v1+v2);}
                    else if(op.peek()=='-'){no.push(v1-v2);}
                   else if(op.peek()=='*'){no.push(v1*v2);}
                   else if(op.peek()=='/'){no.push(v1/v2);}
                    op.pop();
                    }
                    op.pop();
                }
            else{
             
                if(ch=='+'||ch=='-'){
                    int v2=no.pop();
                    int v1=no.pop();
                    if(op.peek()=='+'){no.push(v1+v2);}
                   else if(op.peek()=='-'){no.push(v1-v2);}
                    else if(op.peek()=='*'){no.push(v1*v2);}
                    else if(op.peek()=='/'){no.push(v1/v2);}
                    op.pop();
                    op.push(ch);
                }
                else if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                         int v2=no.pop();
                    int v1=no.pop();
                    if(op.peek()=='*'){no.push(v1*v2);}
                    else if(op.peek()=='/'){no.push(v1/v2);}
                    op.pop();
                    op.push(ch);
                    }
                    else{op.push(ch);}
                }
            }
        }
        while(op.size()>0){
 int v2=no.pop();
                    int v1=no.pop();
                    if(op.peek()=='+'){no.push(v1+v2);}
                    else if(op.peek()=='-'){no.push(v1-v2);}
                    else if(op.peek()=='*'){no.push(v1*v2);}
                   else if(op.peek()=='/'){no.push(v1/v2);}
                    op.pop();
        }
        System.out.println(no.peek());
    }
}
