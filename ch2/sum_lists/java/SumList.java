public class SumList{
    public static void main(String[] args){
        LinkedList ll = new LinkedList(7);
        ll.insert(1);
        ll.insert(6);

        LinkedList ll2 = new LinkedList(5);
        ll2.insert(9);
        ll2.insert(2);
        
        LinkedList ll3 = ll.sumLists(ll2);
        ll3.p();
    }
}
