package SORTING;

public class Ssques02 {
    public static void main(String[] args) {
        //copy m likha h generally hame
        //5 4 2 1 3 ye array ki values h so hamko min ele find krke
        //usme 0 th index dalna h ,then agle use bade m 1,then use bade m 2
        //4 3 1 0 2 will be the ans
        //if all are positive in array so we can use -ve marking
        int arr[]={3,5,2,1,4};//->2 4 1 0 3
        
        int idx=0;
        int x=0;
        for(int i=0;i<arr.length;i++){
             int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
               
                if(arr[j]<min&&arr[j]>0){
                   min=arr[j];
                idx=j;
                } 
               
            }
                arr[idx]=x;
                x--;
        }
        int n=arr.length;
        //for each loop m modify ni hoga ele array m we have to use normal loop.
        for(int i=0;i<n;i++) {
            arr[i]=arr[i]*-1;
             System.out.print(arr[i]+" ");
        }
    }
}
