public class Palindrome{
    public static void main(String[] args){
        // Even palindrome
        LinkedList a = new LinkedList(1);
        a.insert(2); a.insert(2); a.insert(1);

        // Odd palindrome
        LinkedList b = new LinkedList(1);
        b.insert(2); b.insert(3); b.insert(2); b.insert(1);

        // Even non-palindrome
        LinkedList c = new LinkedList(1); c.insert(3);

        // Odd non-palindrome
        LinkedList d = new LinkedList(1); d.insert(333); d.insert(3);

        System.out.println(Boolean.toString(a.palindrome()));
        System.out.println(Boolean.toString(b.palindrome()));
        System.out.println(Boolean.toString(c.palindrome()));
        System.out.println(Boolean.toString(d.palindrome()));
    }
}
