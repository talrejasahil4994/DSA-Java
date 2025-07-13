package Stringandstringbuilers;
import java.util.*;

public class Sbuliderbasic {
    public static void main(String[] args) {
        //declaration and initialization.
       StringBuilder sb=new StringBuilder("abc");

       System.out.println(sb);
       System.out.println(sb.length());
       
//emty or zero length
StringBuilder sa=new StringBuilder("");
System.out.println(sa.length());
StringBuilder sv=new StringBuilder();
System.out.println(sv.length());


StringBuilder s=new StringBuilder(10);//initial capacity
System.out.println(s.length());//used capacity=0
System.out.println(s.capacity());

String sc=new String("abc");
StringBuilder a=new StringBuilder(sc);
System.out.println(a);
System.out.println(a.capacity());//19??

StringBuilder b=new StringBuilder();
//if we dont mention any capacity initialy then take 
//16 capacity by default
System.out.println(b.capacity());


//Taking input SB
Scanner scc =new Scanner(System.in);
String e=scc.nextLine();
//m1
StringBuilder d=new StringBuilder(e);
//also m2
StringBuilder f=new StringBuilder(scc.nextLine());

System.out.println(d);
System.out.println(f);


    }
}
