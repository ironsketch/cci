import java.util.ArrayList;

public class Palper{
    private static ArrayList<String> palper = new ArrayList<String>();
    public static void Palper(String s){
        permutation(s, 0, s.length() - 1);
    }
    public static boolean palindrome(String s){
        String tmp = (s.replaceAll("\\s+","")).toLowerCase();
        for(int i = 0; i < tmp.length() / 2;i++){
            if(tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i))
                return false;
        }
        return true;
    }
    public static String swap(String s, int i, int j){
        char[] tmpCharArr = s.toCharArray();
        char tmpChar = tmpCharArr[i];
        tmpCharArr[i] = tmpCharArr[j];
        tmpCharArr[j] = tmpChar;
        return String.valueOf(tmpCharArr);
    }
    public static void permutation(String s, int l, int r){
        if(l == r && palindrome(s))
            palper.add(s);
        else {
            for(int i = l; i <= r; i++){
                s = swap(s, l, i);
                permutation(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }
    public static void p(){
        for(String s : palper){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        String a = "Taco cat";
        String b = "tact coa";
        Palper(a);
        System.out.println(palper.size());
        //p();
        palper.clear();
        System.out.println(palper.size());
        Palper(b);
        System.out.println(palper.size());
        //p();
        palper.clear();
    }
}
