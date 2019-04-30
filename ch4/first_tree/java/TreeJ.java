public class TreeJ{
    public static void main(String[] args){
        Tree t = new Tree(0);
        t.insert(5);
        t.insert(4);
        t.insert(100);
        t.insert(23);
        t.insert(333);
        t.inorder();
    }
}
