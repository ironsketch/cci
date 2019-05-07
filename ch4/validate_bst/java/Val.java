import java.util.*;

public class Val{
    public static void main(String[] args){
        Tree t = new Tree();
        t.add(10); t.add(15); t.add(4); t.add(7); t.add(13);
        String s = t.inOrder();
        System.out.println(s);
        String[] splited = s.split("\\s+");
        boolean isBST = true;
        for(int i = splited.length; i >= 0; i++){
            if(Integer.parseInt(splited[i]) < Integer.parseInt(splited[i / 2])){
                isBst = false;
                break;
            }
        }

    }
}
