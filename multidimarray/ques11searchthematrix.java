package multidimarray;

public class ques11searchthematrix {
    public static void main(String[] args) {
        //efficient method 240leetcode
    int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    int target=30;
                int m=arr.length;
                int n=arr[0].length;
                int i=0,j=n-1;
                boolean flag=false;
              while(i<m&&j>=0) {
                if(arr[i][j]==target) { flag=true; System.out.println("founded at i:"+i+" j:"+j); break;}
               else {if(arr[i][j]>target) j--;
               else i++;}
              }
        if(flag==false){
            System.out.println("not found");
        }
               
          
          }
        }


