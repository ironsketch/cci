import java.util.*;
public class Stacks<DATA>{
    private ArrayList<Pair<DATA>> allData;
    Stacks(){
        allData = new ArrayList<Pair<DATA>>();
    }

    public void push(int s, DATA d){
        Pair<DATA> p = new Pair<DATA>(s, d);
        allData.add(p);
    }

    public void pop(int s){
        for(int i = allData.size() - 1; i >= 0; i--){
            if(allData.get(i).getStack() == s){
                allData.remove(i);
                return;
            }
        }
    }

    public DATA top(int s){
        for(int i = allData.size() - 1; i >= 0; i--){
            if(allData.get(i).getStack() == s){
                return allData.get(i).getData();
            }
        }
        return null;
    }

    public void p(int s){
        for(int i = 0; i < allData.size(); i++){
            if(allData.get(i).getStack() == s){
                System.out.print(allData.get(i).getData());
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
}

class Pair<DATA>{
    private int stack;
    private DATA data;
    public Pair(int s, DATA d){
        stack = s;
        data = d;
    }
    public DATA getData(){return data;}
    public int getStack(){return stack;}
}
