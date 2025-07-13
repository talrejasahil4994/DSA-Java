package Stringandstringbuilers;
import java.util.*;
public class asortstring {
    public static void main(String[] args) {
        
    //String builder also not have any build in method to sort
    //so we can also no convert string bulider to chararray not any buildin fns
    //so we can first convert it in string and then we can convert it into chararray
    //char arr[]=sb.toString().toCharArray();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char arr[]=s.toCharArray();
     Arrays.sort(arr);
     
    for(char i:arr){
        System.out.print(i);
    }
}
}