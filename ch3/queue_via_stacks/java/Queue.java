import java.util.*;

public class Queue<Obj>{
    private Stack<Obj> q;
    private int size;
    Queue(){
        q = new Stack<Obj>();
        size = 0;
    }
    public void enqueue(Obj n){
        Stack<Obj> tmp = new Stack<Obj>();
        for(int i = 0; i < size; i++){
            tmp.push(q.peek());
            q.pop();
        }
        q.push(n);
        for(int i = 0; i < size; i++){
            q.push(tmp.peek());
            tmp.pop();
        }
        size++;
    }
    public Obj dequeue(){
        Obj tmp = q.peek();
        q.pop();
        size--;
        return tmp;
    }
}
