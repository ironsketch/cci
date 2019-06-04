import java.util.*;
// Min Heap
public class Tree{
    ArrayList<Integer> members;
    Tree(){
        members = new ArrayList<Integer>();
    }
    public void add(int i){
        members.add(i);
        heapify();
    }
    public int min(){return members.get(0);}
    public void heapify(){
        for(int i = members.size() - 1; i >= 0; i--){
            if(members.get(i / 2) > members.get(i))
                swap(i / 2, i);
        }
    }
    public void swap(int i, int j){
        int tmp = members.get(i);
        members.set(i, members.get(j));
        members.set(j, tmp);
    }
    public void p(){
        for(int i = 0; i < members.size(); i++){
            System.out.printf("%d ", members.get(i));
        }
        System.out.println("");
    }
}
