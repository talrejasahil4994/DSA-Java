import java.util.*;
public class oddtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {int a=1;
           for(int j=1;j<=i;j++) {
          //main thing is use a+(n-1)*d
           // System.out.print(2*j-1+" ");
           System.out.print(a+" ");
           a+=2;
        }
        System.out.println();
        }
    }
}
