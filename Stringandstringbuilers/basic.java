package Stringandstringbuilers;
import java.util.*;
public class basic {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        // String str;
    //    str=sc.nextLine();//if we enter sahil talreja means anything with space then
       //it will only store the first string and it takes both as saparate strings
    //    System.out.println("Hii  "+str);
       //we use next line to avoid only taking one word.

       //funtions............   
       //1
       String btr="sahil talreja";
       System.out.println(btr.charAt(3));//show character by taking index
       //2
       System.out.println(btr.length());//gives length of particular string.
  //3
       System.out.println(btr.indexOf('a'));
       //piche s last index bataega piche s phele 'a' k index batega
    //4
    System.out.println(btr.lastIndexOf("a"));
   //5
    //compare to first compare the strings and if there finds a comparision
    //then it minus ascii values from 1 to 2..like a-d=97-100=-3
    //if 1 is abc and second is abcd then it writes extra index =1and if abcdd then=2
    //if we interchange both 1 is abcd and 2 is abc then -1and if abcdd then -2
    //if 1 is abcd and 2 is dbc then always it first compare both and write -3
    //if comparision is done and no element is diff then it checks length
    //if Abc and abc then also A-a = ascii valuess.
    String a="abc";
     String b="dbc";
     System.out.println(a.compareTo(b));

//6
System.out.println(btr.startsWith("s"));//gives ans true and false
//7
System.out.println(btr.contains("ah"));//gives ans true and false

//8
System.out.println(btr.toLowerCase());
System.out.println(btr.toUpperCase());
//it only prints not changes the real values but if we want to
//so we can c="abc";  c=c.toUpperCase();

//9
//concat
System.out.println(a+b);
System.out.println(a.concat(b));//not permanent change if want c=c.concat(b);
System.err.println(a.concat("sahil"));
   
//10
System.out.println(btr.substring(2));
System.out.println(btr.substring(1, 4));
//here substring(i,j) here i is included and j is excluded.
//it prints from i to j-1;

//plus operator
String d=a+b;
System.out.println(d);
d=a+"sahil";
System.out.println(d);
d=a+b+10;
System.out.println(d);
d=a+10+20;
System.out.println(d);

d=10+20+a;
System.out.println(d);


}
}