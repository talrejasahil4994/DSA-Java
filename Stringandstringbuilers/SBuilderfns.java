package Stringandstringbuilers;

public class SBuilderfns {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        StringBuilder sc=new StringBuilder("dbc");

        System.out.println(sb.compareTo(sc));
        System.out.println(sc.toString());
        //index ,lastindex dono h ,upper case nhi hand lower also
         System.out.println(sb.reverse());
         //you can check more fns by typing sb.

         //setCharAt()=main funtion and diffbetween string
         //there is CharAt function available in string builder too..
         sb.setCharAt(0, 'a');
         System.out.println(sb);

         //append function
         sb.append(10);
         System.out.println(sb);
         sb.append('*');
       System.out.println(sb);

         sb.append(true);
        char ch[]={'a','b','c'};
         sb.append(ch);
         System.out.println(sb);
// int in[]={1,2,3,4,5};
//          sb.append(in);
//          System.out.println(sb);//not possible append address of array

//insert and delete
     sb.deleteCharAt(0);
     System.out.println(sb);
     sb.delete(0, 3);//i,j where i is included and j is excluded just same as in substring
     System.out.println(sb);

     sb.insert(0,"xyz");
     System.out.println(sb);
     sb.insert(0,true);
     System.out.println(sb);
     sb.insert(0,343);
     System.out.println(sb);
//we can insert many things and it is dif from setcharat because
//in char at it removes and give that place to another element 
//but in insert the element get shifted when we add some


    }
}
