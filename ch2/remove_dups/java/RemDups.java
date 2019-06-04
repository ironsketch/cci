public class RemDups{
    public static void main(String[] args){
        // Main LL to test with :D
        LinkedList ll = new LinkedList();
        ll.insert(1); ll.insert(2); ll.insert(3); ll.insert(4);
        ll.insert(5); ll.insert(6); ll.insert(7); ll.insert(8);

        // Empty LL
        LinkedList ll2 = new LinkedList();
        
        // Testing print
        ll.p();
        // Testing print on an empty LL
        ll2.p();

        // Testing removing first element
        ll.remove(0);
        ll.p();

        // Testing removing last element
        ll.remove(ll.size() - 1);
        ll.p();

        // Smol remove dupliates test
        LinkedList small = new LinkedList(1);
        small.insert(1); small.insert(4); small.insert(4); small.insert(3); small.insert(3);

        small.p();
        small.remDups();
        small.p();

        // Testing removing duplicates
        LinkedList duplicates = new LinkedList(1);
        duplicates.insert(3); duplicates.insert(3); duplicates.insert(4);
        duplicates.insert(42); duplicates.insert(111); duplicates.insert(4);
        duplicates.insert(1); duplicates.insert(3); duplicates.insert(4883);
        duplicates.insert(2); duplicates.insert(111); duplicates.insert(41);
        duplicates.insert(6); duplicates.insert(333); duplicates.insert(44);
        duplicates.insert(36); duplicates.insert(35); duplicates.insert(34);
        duplicates.insert(6); duplicates.insert(5); duplicates.insert(1);
        
        duplicates.p();
        duplicates.remDups();
        duplicates.p();
    }
}
