package Recursion;
//leetcode38
class ques14 {
    public static String countAndSay(int n) {
        if(n==1){return "1";}
        String str=countAndSay(n-1)+'@';
        int m=str.length();
        int i=0;
        int j=0;
        String ans="";
        while(j<m){
            if(str.charAt(i)==str.charAt(j)){
                j++;
            }
            else{
                int count =j-i;
                ans=ans+count;
                ans=ans+str.charAt(i);
                i=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String ans=countAndSay(4);
        System.out.println(ans);
    }
}
