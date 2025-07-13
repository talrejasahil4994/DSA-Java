package MergeandQuicksort;

public class mergesort {
    public static void mergetwosortedarray(int a[],int b[],int arr[]){
        int n=a.length;
        int m=b.length;
        int i=0; int j=0; int k=0;
        while(i<n&&j<m){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }
            else{ arr[k++]=b[j++];}
        }
        while(j<m){arr[k++]=b[j++];}
        while(i<n){arr[k++]=a[i++];}
    }
    public static void mergesort(int arr[]){
        int n=arr.length;
        if(n==1) return;//BASE CASE
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        for(int i=0;i<n/2;i++){
          a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
        b[i]=arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);
        mergetwosortedarray( a, b, arr);
        a=null; b=null;//s.c =o(n)

    }
    public static void main(String[] args) 
   { int arr[]={5,3,4,2,1};
    mergesort(arr);
    for(int ele:arr){
        System.out.print(ele+" ");
    }
}
}
