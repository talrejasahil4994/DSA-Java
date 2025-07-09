package arrays;
import java.util.*;
public class ques1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={81,17,45,36,31,100,60};
for (int i=0;i<arr.length;i++) {
    if(arr[i]>35) {
        System.out.println("roll no "+i+" is pass");
    }
    else{System.out.println("roll no "+i+" is fail");}
}
}
}
