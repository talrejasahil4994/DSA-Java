package Stringandstringbuilers;

public class ques05evenposcharaddinstring {
    public static void main(String[] args) {
        //INPUT A STRING AND UPDATE ALL THE EVEN POSITION
        //IN THE STRING TO CHARACTER'a'.CONSIDER 0-BASED INDEXING.
        String s="ABCDEFGHIZKLMNOPQRSTUVWXYZ";
        //very costly and space and time consuming.
        int n=s.length();
        //my method
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //      s=s.substring(0,i)+'a'+s.substring(i+1);
        //         String g=""+
        //     }
        // }
        // 
        //sir s method
        String str="";
        for(int i=0;i<n;i++){
            if(i%2==0){
                str+='a';
            }
            else str += s.charAt(i);
        }
        System.out.println(str);
        s=str;
        System.out.println(s);
    }
}
