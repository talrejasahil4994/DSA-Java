package Recursion;

public class astringtraverse {
    public static void traverse(String s,int i) {
       
        if(i==s.length()){return;}
          System.out.print(s.charAt(i));
           traverse(s,i+1);
     }
     public static void main(String[] args) {
         String s="sahil talreja";
         traverse(s,0);
     }
}
