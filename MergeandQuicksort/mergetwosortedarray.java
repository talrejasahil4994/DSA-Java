package MergeandQuicksort;

public class mergetwosortedarray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={15,20,35};
        int n=a.length;
        int m=b.length;
        int c[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m){
            if(a[i]<=b[j]){
              c[k]=a[i];//also c[k++]=a[i++]
              i++;
              k++;
            }
            else{
                c[k]=b[j];
                 j++;
                 k++;
            }
        }
        while(i>=n&&j<m){//direct j<m se bhi hojaega
            c[k]=b[j];
            j++;
            k++;
        }
        while(j>=m&&i<n){
            c[k]=a[i];
            i++;
            k++;
        }
        for(int ele:c){
            System.out.println(ele);
        }
    }
}
