package BinarySearch;

public class ques02 {
    public static void main(String[] args) {
        //leetcode852
        //find peak index in mountain array(not increasing)
        //1 2 3 5 3 2 1
        //here peak index is 3
        int arr[]={3,5,3,2,0};
        int n=arr.length;
        int lo=1;
        int hi=n-2;
        int i=0;
        //only have 3 cases if both side are greater or one side small other side will be greater and viceversa.
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){i=mid; break;}
            else if(arr[mid]<arr[mid-1]&&arr[mid]>arr[mid+1]){hi=mid-1;}
            else if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]){lo=mid+1;}
        }
        System.out.println(i);
    }
}
