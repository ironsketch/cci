public class Part{
    public static void main(String[] args){
        LinkedList ll = new LinkedList(100);
        ll.insert(5); ll.insert(4); ll.insert(88); ll.insert(0);
        ll.insert(42); ll.insert(44); ll.insert(2); ll.insert(3);

        ll.p();
        ll.partition(5);
        ll.p();
    }
}
