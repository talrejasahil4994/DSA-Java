package Recursion;

public class ques07 {
    //remove all by travesing in a string
    //skipping a character
    public static void traverse(String s,int i,String ans) {
       
        if(i==s.length()){
            System.out.println(ans);return;}
        if(s.charAt(i)=='a'||s.charAt(i)=='A') {;}
        else{ans=ans+s.charAt(i); }
           traverse(s,i+1,ans);

     }
     public static void main(String[] args) {
         String s="sahil talreja";
         String ans="";
         traverse(s,0,"");
       
     }
}
