package Stack;
class st{
    int arr[]=new int[4];
    int idx=0;
    void push(int i){
        if(is_full()){System.out.println("stack is full");}
        else{
        arr[idx]=i;
        idx++;}
    }
    int pop(){

        if(idx==0){return 0;}
        int top =arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    int size(){
        return idx;
    }
    Boolean is_full(){
        if(arr.length==idx){return true;}
        else return false;
    }
    Boolean is_empty(){
        if(idx==0){return true;}
        else return false;
    }
    void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    int peek(){
        if(idx==0){
            return -1;
        }
        else {return arr[idx-1];}
    }
}
public class userdefinedarray {
    public static void main(String[] args) {
        st s=new st();
        System.out.println(s.is_empty());
       System.out.println( s.is_full());
        System.out.println(s.size());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println();
        System.out.println(s.is_empty());
       System.out.println( s.is_full());
        System.out.println(s.size());
        s.pop();
        s.display();
        System.out.println(s.size());
    }
}
