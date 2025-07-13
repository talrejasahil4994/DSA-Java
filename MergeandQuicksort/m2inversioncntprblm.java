package MergeandQuicksort;

public class m2inversioncntprblm {  
     static int count ; 
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
public static void inversioncount(int a[],int b[]){
    int i=0;
    int j=0;
while(i<a.length&&j<b.length){
    if(a[i]>b[j]){
        count+=a.length-i;
        j++;
    }
    else i++;
}
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
    inversioncount( a, b);
    mergetwosortedarray( a, b, arr);
    a=null; b=null;//s.c =o(n)

}
public static void main(String[] args) 
{ int arr[]={8,2,5,3,1,4};
count=0;
mergesort(arr);
for(int ele:arr){
    System.out.print(ele+" ");
}
System.out.println("\n"+count);
}
}
