public class RetKth{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insert(0); ll.insert(1); ll.insert(2); ll.insert(3); ll.insert(4);
        ll.insert(5); ll.insert(6); ll.insert(7); ll.insert(8); ll.insert(9);

        // Testing return kth to last element
        ll.p();

        // Returns last element
        System.out.println(ll.kthLast(0));        

        // Returns first element
        System.out.println(ll.kthLast(ll.size() - 1));

        // Returns the number 4 for the 5th (starting at 0) from the end
        System.out.println(ll.kthLast(5));
    }
}
