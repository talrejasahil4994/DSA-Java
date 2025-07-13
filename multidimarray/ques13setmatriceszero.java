package multidimarray;
public class ques13setmatriceszero {

    public static void main(String[] args) {
        //leetcode 73
         int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
                int m = arr.length;
                int n = arr[0].length;
                boolean row=false;
                boolean column=false;
                for(int i=0;i<m;i++){//check if any row has intial zeros or not and then we make that col also zero and row gets zero by loop
                    if(arr[i][0]==0){
                        column=true;
                        break;
                    }
                }
                 for(int j=0;j<n;j++){//check if any column has intial zeros or not and then we make that row also zero and column gets zero by loop
                    if(arr[0][j]==0){
                        row=true;
                        break;
                    }
                }
               for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(arr[i][j]==0){
                        arr[i][0]=0;
                        arr[0][j]=0;
                    }
                }
               }
                 for(int i=1;i<m;i++){
                    
                    if(arr[i][0]==0){
                     for(int j=1;j<n;j++){
                        arr[i][j]=0;
                                     }
                    }
                 }
          for(int j=1;j<n;j++){
                    if(arr[0][j]==0){
                     for(int i=1;i<m;i++){
                        arr[i][j]=0;
                                     }
                    }
                    
                }
                  
                    if(column==true){for(int i=0;i<m;i++){
                       arr[i][0]=0;
                    }
                }
                 
                if(row==true){for(int j=0;j<n;j++){
                       arr[0][j]=0;
                    }
                }
               
        for(int ele[]:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
               
            }
        }
       
