import java.util.*;
public class OStack{
    private Stack<Integer> data;
    OStack(){
        data = new Stack<Integer>();
    }
    public void push(int o){
        if(data.empty()){
            data.push(o);
        } else {
            Stack<Integer> tmpStack = new Stack<Integer>();
            while(!data.empty() && data.peek() <= o){
                tmpStack.push(data.pop());
            }
            data.push(o);
            while(!tmpStack.empty()){
                data.push(tmpStack.pop());
            }
        }
    }
    public void pop(){
        data.pop();
    }
    public int peek(){
        return data.peek();
    }
    public boolean isEmpty(){
        return data.empty();
    }
}
