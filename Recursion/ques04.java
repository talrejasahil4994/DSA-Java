package Recursion;
public class ques04 {
    //nth stair chandi h or ak bari m 1 ya 2 hi chad skta h...
    public static int stair(int n){
        // if(n==1){return 1;}
        // if(n==2){return 2;}
        if(n<=2){return n;}
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        int i=stair(5);
        System.out.println(i);
    }
}
