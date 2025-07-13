package BinarySearch;

import java.util.Scanner;

public class bslowerbound {
    //LOWER BOUND MTLB KI JO BHI NO INPUT KROGE USSE SAME NO DEKHEGA AGHR H TOH VOH
    //ANS AND IF IT COMES MULTIPLE TIMES THAN IT WILL TAKE ONLY SMALLER INDEX VALUE
    //AND IF IT IS NOT PRESENT THEN IT WILL GIVE JUST BIGGER NO THEN THAT
    //IF TARGET IS LAST INDEX VALUE OR WE CAN SAY BIGGEST VALUE THEN IT WILL GIVE N RESULT DEDIYA JATA
    //H KYO KI AEGA TOH AGGE HI AND THEN IF WE GIVES ANY SMALLER ONE THEN IT WILL GIVES ALWAYS 0 INDEX AS ANS
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,4,4,4,5,6,8,9};
        int n=arr.length;
        
        int x=sc.nextInt();
        int low=0;
        int high=n-1;
        int lb=n;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                lb=Math.min(mid, lb);
                high=mid-1;
            }
            else{low=mid+1;}
           
        }
        System.out.println("LOWER BOUND: "+lb);
      
    }
}
