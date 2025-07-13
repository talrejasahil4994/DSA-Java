package multidimarray;

public class ques12binarymatrixfliptomaximum {
    public static void main(String[] args) {
        //861 leetcode
int arr[][]={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
                int m = arr.length;
                int n = arr[0].length;
                //flip no of os to 1s in first column.
                //put 1 at every position of row.
                for (int i = 0; i < m; i++) {
                    if (arr[i][0] == 0) {
                        for (int j = 0; j < n; j++) {
                            if (arr[i][j] == 0)
                                arr[i][j] = 1;
                            else
                                arr[i][j] = 0;
                        }
                    }
                }
        //flip those columns whose no of zeros are less than no of ones.
                for (int j =1; j < n; j++) {
                    int count0 = 0;
                    int count1 = 0;
                    for (int i = 0; i < m; i++) {
        
                        if (arr[i][j] == 0) {
                            count0++;
                        }else count1++;
                    }
                    if (count0 > count1) {
                        for (int i = 0; i < m; i++) {
                            if (arr[i][j] == 0)
                                arr[i][j] = 1;
                            else
                                arr[i][j] = 0;
                        }
                    }
        
        
                }
                //sum of all rows and store it in int value
                int score=0;
                int x=1;
                     for(int j=n-1;j>=0;j--) {
                        for(int i=0;i<m;i++) {
                            score=score+arr[i][j]*x;
                        }
                        x=x*2;
                     }
             System.out.println(score);
            }
        }
    
