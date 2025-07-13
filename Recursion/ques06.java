package Recursion;
import java.util.*;
public class ques06 {
    //maze path decription copy m h ex like 3x3 k maze use hame
    //top left corner s botton right corner p jane k kitne path honge ye batana h.
    public static int maze(int m,int n) {
//my trick
        // if(m<2&&n==2||m==2&&n<2){
        //     return 1;
        // }
        // if(m==0||n==0){return 0;}

//sir trick
         if(m==1||n==1)return 1;
        return maze(m,(n-1))+maze((m-1),n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System .in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i=maze(m,n);
        System.out.println(i);
    }
}
