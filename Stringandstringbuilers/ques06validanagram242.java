package Stringandstringbuilers;

import java.util.Arrays;

public class ques06validanagram242 {
    public static void main(String[] args) {
        //leet code 242
        //it checks the string alphabets if the alphabets in string s is same as in t
        //in nos or in equality too then we can say they are anagram.
        String s="abc";
        String t="bca";
        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();
         Arrays.sort(arr);
        Arrays.sort(brr);
          
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=brr[i]){
               System.out.println("false");
            }
            else System.out.println("true");
    }
}
}