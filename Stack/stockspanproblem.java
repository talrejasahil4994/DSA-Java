package Stack;

import java.util.Stack;

public class stockspanproblem {
    public static void main(String[] args) {
        int price[]={10,20,30,40};
        int ans[]=new int[price.length];
        ans[0]=1;
         int i=0;
        Stack<Integer> st=new Stack<>();
        st.push(i);
        
        for(i=0;i<price.length;i++){
            while(st.size()>0&&price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.size()==0){ ans[i]=i+1;}
            else  ans[i]= i-st.peek();

            st.push(i);
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
