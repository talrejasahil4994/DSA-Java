package SORTING;

public class BASICS {
public static void main(String[] args) {
    int arr[]={1,10,15,3,4,5};
    int n=arr.length;
    boolean check=true;
    for(int i=0;i<n-1;i++){
        if(arr[i]>=arr[i+1]){
            check =false;
        }
    }
    if(check==true){System.out.println("SORTED");}
    else{System.out.println("NOT SORTED");}
}    
}
