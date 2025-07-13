package Stringandstringbuilers;
import java.util.*;

public class ques07maxalphabetfinder {
    public static void main(String[] args) {
        //frequency array ..
        //count the maximum coming alphabet in the string without gap and capital letters
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
  
        arr[(int)s.charAt(i)-97]= arr[(int)s.charAt(i)-97]+1;
      //for good code
      //char ch=s.charAt(i);
      //int temp=(int)chl
      //arr[temp-97]++;
        }
        int max=0;
        for(int i=0;i<26;i++){
           if(arr[i]>max){
            max=arr[i];
           } 
        }
        for(int i=0;i<26;i++){
            if(arr[i]==max){
            System.out.print((char)(i+97)+" "); 
            }
    }
}
}
