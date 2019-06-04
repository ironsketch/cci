import java.util.*;

public class Merge{
    private static void p(ArrayList<Integer> n){
        int i;
        for(i = 0; i < n.size() - 1; i++){
            System.out.printf("%d, ", n.get(i));
        }
        System.out.printf("%d\n", n.get(i));
    }
    private static void merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> n = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < a.size() - 1){
            if(j < b.size() && a.get(i) < b.get(j))
                n.add(a.get(i++));
            if(j < b.size() && b.get(j) < a.get(i))
                n.add(b.get(j++));
        }
        while(i < a.size())
            n.add(a.get(i++));
        while(j < b.size())
            n.add(b.get(j++));

        p(n);
    }
    private static void setUp(ArrayList<Integer> a, ArrayList<Integer> b){
        a.add(1); a.add(2); a.add(3); a.add(6); a.add(7); 
        a.add(15); a.add(17);
        b.add(4); b.add(8); b.add(54); b.add(77);
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        setUp(a,b);
        merge(a,b);
    }
}
