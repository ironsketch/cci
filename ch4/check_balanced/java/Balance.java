public class Balance{
    public static void main(String[] args){
        Tree t = new Tree();
        t.add(4);
        t.add(6);
        t.add(8);
        Tree t2 = new Tree();
        t2.add(4);
        t2.add(3);
        t2.add(5);
        System.out.println(t.isBalanced());
        System.out.println(t2.isBalanced());
    }
}
