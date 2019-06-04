import java.lang.Math;
import java.util.*;

public class OneAway{
    public static boolean OneAway(String s1, String s2){

        int numberOfEdits = 0;
        // insert char
        // remove char
        // replace char
        if(s1.equals(s2)){
            return true;
        }
        numberOfEdits += Math.abs(s1.length() - s2.length());
        if(numberOfEdits > 1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "meow";
        String s2 = "mew";
        OneAway(s1, s2);
    }
}
