package Recursion;

public class preinpost { //input- 1      2         3   
    //ques-print zigzag pattern 111 211121112 321112111232111211123
    public static void pip(int n) {
        if(n==0)return ;
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
        
    }
    public static void main(String[] args) {
        pip(3);
    }
}
