import java.util.*;

public class Ana{
    public static void p(ArrayList<String> l){
        for(int i = 0; i < l.size(); i++)
            System.out.printf("%s ", l.get(i));
        System.out.println("");
    }
    public static boolean isPal(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
    public static ArrayList<String> ana(ArrayList<String> l){
        ArrayList<String> pal = new ArrayList<String>();
        ArrayList<String> nopal = new ArrayList<String>();
        for(int i = 0; i < l.size(); i++){
            if(isPal(l.get(i)))
                pal.add(l.get(i));
            else
                nopal.add(l.get(i));
        }
        for(int i = 0; i < nopal.size(); i++)
            pal.add(nopal.get(i));
        return pal;
    }
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<String>();
        a.add("aabbaa"); a.add("cat"); a.add("boob");
        b.add("hardydrah"); b.add("baab");
        c.add("dog"); c.add("cat"); c.add("dumb");
        p(ana(a));
        p(ana(b));
        p(ana(c));
        p(ana(d));
    }
}
