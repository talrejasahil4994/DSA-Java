package Recursion;

public class ques08 {
    //global array list banake bhi kam kr skte h
    //static ArrayList<String> arr=new ArrayList<>();
    public static void subset(String s,String ans,int i){
      if(i==s.length()){
         System.out.println(ans);//arr.add(ans);
        return;
    }
       subset(s, ans+s.charAt(i), i+1);//take
       subset(s, ans, i+1);//not take
    }
   public static void main(String[] args) {
    subset("abc","",0);
    //System.out.println(arr);
   } 
}
