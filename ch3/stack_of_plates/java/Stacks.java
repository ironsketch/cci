import java.util.*;
public class Stacks<Obj>{
    private ArrayList<ArrayList<Obj>> d;
    private int height;
    Stacks(int t_height){
        height = t_height;
        d = new ArrayList<ArrayList<Obj>>();
        ArrayList<Obj> first = new ArrayList<Obj>();
        d.add(first);
    }

    public void push(Obj object){
        if(d.get(d.size() - 1).size() == height){
            ArrayList<Obj> newArr = new ArrayList<Obj>();
            d.add(newArr);
            d.get(d.size() - 1).add(object);
        } else {
            d.get(d.size() - 1).add(object);
        }
    }

    public void pop(){
        if(d.get(d.size() - 1).size() == 0){
            d.remove(d.size() - 1);
        }
        d.get(d.size() - 1).remove(d.get(d.size() - 1).size() - 1);
    }

    public Obj top(){
        return d.get(d.size() - 1).get(d.get(d.size() - 1).size() - 1);
    }

    public void p(){
        for(int i = 0; i < d.size(); i++){
            for(int j = 0; j < d.get(i).size(); j++){
                System.out.print(d.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
