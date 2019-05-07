import java.util.*;

public class Depth{
    public static void main(String[] args){
        Tree t = new Tree();
        t.add(10); t.add(15); t.add(4); t.add(7); t.add(13);
        ArrayList<LinkedList <Node>> d = t.depth();
        System.out.println("inserted in order:\n10, 15, 4, 7, 13\n");
        for(int i = 0; i < d.size(); i++){
            for(int j = 0; j < d.get(i).size(); j++){
                System.out.printf("%d ", d.get(i).get(j).data);
            }
            System.out.printf("\n");
        }
    }
}
