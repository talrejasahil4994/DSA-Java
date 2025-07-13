package Stringandstringbuilers;
import java.util.*;
public class ques04countnofdigitswithoutloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //method 1
        String str=n+"";
      //method 2  //String str=Integer.tostring(n);
        System.out.println(str.length());
    }
}
