package Recursion;
public class ques05 {
    //stair path with 1 or 3 stairs at a time.
    public static int stair(int n){
        if(n<=2){return 1;}
        
        return stair(n-1)+stair(n-3);
    }
    public static void main(String[] args) {
        int i=stair(6);
        System.out.println(i);
    }
}
