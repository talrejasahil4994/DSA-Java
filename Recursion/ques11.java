package Recursion;

public class ques11 {
    //finding all the permutations of an string  given all elements of string are unique.
    public static void permutations (String s,String ans){
     if(s.length()==0){
        System.out.println(ans);
        return ;
     }
    //  if(i==n){return ;}
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        String left=s.substring(0, i);
        String right=s.substring(i+1);
        permutations(left+right, ans+ch);
     }
     
    }
    public static void main(String[] args) {
        String s="abc";
        permutations( s,"");
    }
}
