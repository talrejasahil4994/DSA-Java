package Stringandstringbuilers;

public class ques10stringcompression {
    public static void main(String[] args) {
        ///we can use stringbuilder it gives 1ms in runtime and string takes 10ms 10times faster.
        char chars[]={'a','a','a','b','b','c','c'};
        int n= chars.length;
        int i=0;
        int j=0;
        String ans="";
        while(j<n){
            if(chars[i]==chars[j]){
                j++;
            }
        else  {ans=ans+chars[i]+(j-i);
          i=j;
         }
    }
    ans=ans+chars[i]+(j-i);
    System.out.print(ans);
    
}
}
