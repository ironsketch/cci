public class DelNode{
    public static void main(String[] args){
        LinkedList ll = new LinkedList(0);
        ll.insert(1); ll.insert(2); ll.insert(3); ll.insert(4);
        ll.insert(5); ll.insert(6); ll.insert(7); ll.insert(8);
        
        // Testing a big odd list
        System.out.println("Testing a big odd list");
        ll.p();
        ll.delMid();
        ll.p();
        System.out.println("");

        // Testing a big even list
        System.out.println("Testing a big even list");
        LinkedList ll2 = new LinkedList(0);
        ll2.insert(1); ll2.insert(2); ll2.insert(3);
        ll2.p();
        ll2.delMid();
        ll2.p();
        System.out.println("");

        // Testing 2 elements
        System.out.println("Testing 2 elements");
        LinkedList two = new LinkedList(0);
        two.insert(1);
        two.p();
        two.delMid();
        two.p();
        System.out.println("");

        //Testing 1 element
        System.out.println("Testing 1 element");
        LinkedList one = new LinkedList(0);
        one.p();
        one.delMid();
        one.p();
        System.out.println("");
    }
}
