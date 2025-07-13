package Stringandstringbuilers;

public class interning {
    public static void main(String[] args) {
        String str="Raghav";//string is created "Raghav" and sis pointing it.
        //Raghav->Madhav
    //  errrors //  str.charAt(0)='M';
               //   str.charAt(2)='d';
               //string is immutable
               str="Madhav";//new string"madhav" is created and s points madhav
               System.out.println(str);
               String btr="Madhav";//memory m check hua madhav phele s tha so btr usko point krne lga
               //now str and btr both are pointing it.
               System.out.println(btr);
               //isse space bachti h and dikkt bhi hoti hat 
               String t=new String("Madhav");
                //isse ak new string bani madhav nam ki and t points it.
                System.out.println(t);
              
    }
}
