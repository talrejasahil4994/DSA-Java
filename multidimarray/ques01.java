package multidimarray;
import java.util.*;
public class ques01 {
    public static void main(String[] args) 
    {
      
   
    //write aprogram to store roll number and marks
    //obtained by 4 students side by side in a matrix.
    Scanner sc=new Scanner(System.in);
    int[][] students=new int[4][2];
    for(int i=0;i<4;i++) {
        for(int j=0;j<2;j++) {
           students[i][j]=sc.nextInt();
        }
    }
    System.out.println("rollno  marks");
    for(int i=0;i<4;i++) {
        for(int j=0;j<2;j++) {
           System.out.print(students[i][j]+"         ");
        }
        System.out.println();
    }
}
}
