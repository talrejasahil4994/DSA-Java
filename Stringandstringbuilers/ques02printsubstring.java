package Stringandstringbuilers;

public class ques02printsubstring {
    public static void main(String[] args) {
        //print all the substring of given string.
        String str="abcd";
        int n=str.length();
        for (int i=0;i<n;i++){//i<=n bhi likh skte loop chlega 5,5 k liye print ni hoga
            for (int j=i+1;j<=n;j++){//j=i bhi likh skte h fir 0,0 check hoga mtlb ni 
               
                System.out.print(str.substring(i,j));
                 System.out.println();
            }
           
        }
    }
}
