package Stringandstringbuilers;

public class ques09maxvalueinstring {
 public static void main(String[] args) {
    //method one when int length is limited.
    // String arr[]={"456","5643","7869","123"};
    // int mx=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    //  int n=Integer.parseInt(arr[i]);
    //  mx=Math.max(mx,n);
    // }
    // System.out.println("maximum value:"+mx);

    //method 2 where we can pass any length integer
    //
    String arr[]={"45672333828377293","0000000000000000000000000000000000000000000032323343","786339","11111111111111111111111111123"};
    String ms=arr[0];
    for(int i=1;i<arr.length;i++){
    ms=maxx(ms,arr[i]);
    }
    System.out.println("MAXIMUM : "+ms);


 }   
 public static String maxx(String s,String t){
 String a=purify(s);
 String b=purify(t);
 if(a.length()>b.length()) return s;
 if(a.length()<b.length()) return t;
 for(int i=0;i<a.length();i++){
if (a.charAt(i)!=b.charAt(i))
{if(a.charAt(i)>b.charAt(i)) return s;
else return t;}
 }
 if(s.length()>=t.length()) return s;
 else return t;


 }
 public static String purify (String s){
    for(int i=0;i<s.length();i++){
      //yaad rakhna !=0 likh diya tha and ye char h so '0'ase dena hoga
        if(s.charAt(i)!='0') return s.substring(i);
        
    }
 return s;}
}
