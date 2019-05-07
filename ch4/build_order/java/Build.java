import java.util.*;

public class Build{
    public static void main(String[] args){
        ArrayList<Projects> pro = new ArrayList<Projects>();
        Projects a = new Projects("a"); Projects b = new Projects("b");
        Projects c = new Projects("c"); Projects d = new Projects("d");
        Projects e = new Projects("e"); Projects f = new Projects("f");
        pro.add(a); pro.add(b); pro.add(c); 
        pro.add(d); pro.add(e); pro.add(f);

        ArrayList<Pair<String, String>> dep = new ArrayList<Pair<String, String>>();
        Pair<String, String> p1 = new Pair<String, String>("a", "d"); 
        Pair<String, String> p2 = new Pair<String, String>("f", "b");
        Pair<String, String> p3 = new Pair<String, String>("b", "d"); 
        Pair<String, String> p4 = new Pair<String, String>("f", "a");
        Pair<String, String> p5 = new Pair<String, String>("d", "c");

        build_order(pro, dep);
    }
    public String build_order(ArrayList<Projects> p, ArrayList<Pair<String, String>> d){

    }
}
