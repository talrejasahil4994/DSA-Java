package Stringandstringbuilers;

public class chngindivichar {
    public static void main(String[] args) {
        String s="hello";
        //hello->heylo
        s=s.substring(0,2)+ 'y'+s.substring(3);
        //phele y string m convert hua,substring bani he and lo and then 1. he 2.he+y 3.he+y+lo.
        //this take too much time and space
        //1.he  2.y 3.hey 4.lo 5.heylo.or last m new string banke point hoti h s se
        System.out.println(s);
    }
}
