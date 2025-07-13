package Stringandstringbuilers;

public class equalsoperators {
    public static void main(String[] args) {
        String s="abcdgf";
      //'==' int k case m ye shi s check krta h but string k case
      //m ye only addresses ko compare krta h
        // String g ="abcdgf";
        // System.out.println(s==g);  //true because adress same h.
        String g="abc"; //false
        g=g+"dgf";//new address p bana isiye false
        System.out.println(s);//abcdgf
        System.out.println(g);//abcdgf
        System.out.println(s==g);//false
              System.out.println(s.equals(g));//true because char check hue

        String t=new String(s);//new address p bana.
        System.out.println(s==t);//false
        //== se bachna h toh equals() use krte h ye char by char compare krta h
         System.out.println(s.equals(t));//true 
         System.out.println(s.compareTo(t));
    }
}
