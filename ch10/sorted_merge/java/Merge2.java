import java.util.*;

public class Merge2{
    private static void p(ArrayList<Integer> n){
        int i;
        for(i = 0; i < n.size() - 1; i++){
            System.out.printf("%d, ", n.get(i));
        }
        System.out.printf("%d\n", n.get(i));
    }
    private static void merge(ArrayList<Integer> a, ArrayList<Integer> b){
        int count = 0;
        while(b.size() > 0){
            int i = 0;
            int holder = b.get(b.size() - 1);
            while(i < a.size() && holder > a.get(i))
                i++;
            for(int t = i; t < a.size() - count; t++){
                int tmp = a.get(t);
                a.set(t, holder);
                holder = tmp;
            }
            if(i == a.size() - count){
                System.out.println(a.size() - count - 1);
                a.set(a.size() - count - 1, holder);
                count++;
            }
            b.remove(b.size() - 1);
        }
    }
    private static void setUp(ArrayList<Integer> a, ArrayList<Integer> b){
        a.add(2); a.add(3); a.add(6); a.add(7); a.add(15); a.add(17);
        a.add(-1); a.add(-1); a.add(-1); a.add(-1); a.add(-1);
        b.add(1); b.add(4); b.add(8); b.add(54); b.add(77);
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        setUp(a,b);
        merge(a,b);
        p(a);
    }
}
