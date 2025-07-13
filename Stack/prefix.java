package Stack;

import java.util.Stack;

public class prefix {
    public static void main(String[] args) {
        Stack<String> no=new Stack<>();
        Stack<Character> op=new Stack<>();
        String s="9-(5*6)+7";
                for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                String str=""+ch;
                no.push(str);
            }
            else if(op.size()==0||ch=='('||op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                    while(op.peek()!='('){
                        String v2=no.pop();
                    String v1=no.pop();
                   char po=op.pop();
                   String str=po+v1+v2;
                   no.push(str);
                    }
                    op.pop();
                }
            else{
             
                if(ch=='+'||ch=='-'){
                    //mam n ye wala glt bataya h aghr isme * ya / k baad + ya -  aega toh glt dega isliye mene while lagaya 
                    //stack me phle + , * ,- ane ki wajah se glt ara tha
                    //- ane pr sirf * bhr hota + rehta h isliye glt ans ata h
                    //thatswhy mene while null loop lagaya h
                   while(!op.isEmpty()){
                   String v2=no.pop();
                    String v1=no.pop();
                   char po=op.pop();
                   String str=po+v1+v2;
                    no.push(str);}
                   op.push(ch);
                 }
                else if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                       String v2=no.pop();
                    String v1=no.pop();
                   char po=op.pop();
                   String str=po+v1+v2;
                   no.push(str);
                    op.push(ch);
                    }
                    else{op.push(ch);}
                }
            }
        }
        while(no.size()>1){
                    String v2=no.pop();
                    String v1=no.pop();
                   char po=op.pop();
                   String str=po+v1+v2;
                   no.push(str);
        }
        System.out.println(no.peek());
    }
}
