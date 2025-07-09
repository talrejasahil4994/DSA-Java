package arrays;

public class ques07mergetwosortedarray 
{
    public static void main(String[] args) 
    {
        //very important most imp***
        int[] a={11,33,42,62};
        int[] b={26,54,69,81,94};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n) {
            if(a[i]<=b[j]) 
            {
                c[k]=a[i];
                k++;
                i++;
            }
            else 
            {
                c[k]=b[j];
                k++;
                j++;
            }
           
            
        }

        if(i==m)
       {
          while(j<n)  {c[k]=b[j];
            j++;
            k++;}
        }
       if(j==n)
        {
           while(i<m){ c[k]=a[i];
            i++;
            k++;}
        }
        for(int ele:c) {
            System.err.print(ele+" ");
        }
    }
}
