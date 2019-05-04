public class Sort{
    public static void main(String[] args){
        // Testing in order already
        OStack os = new OStack();
        os.push(10); os.push(9); os.push(8); os.push(7); os.push(6);
        os.push(5); os.push(4); os.push(3); os.push(2); os.push(1);
        System.out.println(os.peek());

        // Testing in reverse order
        OStack os2 = new OStack();
        os2.push(1); os2.push(2); os2.push(3); os2.push(4); os2.push(5); 
        os2.push(6); os2.push(7); os2.push(8); os2.push(9); os2.push(10); 
        System.out.println(os2.peek());

        // Testing all the same number
        OStack os3 = new OStack();
        os3.push(1); os3.push(1); os3.push(1); os3.push(1); os3.push(1); 
        os3.push(1); os3.push(1); os3.push(1); os3.push(1); os3.push(1); 
        System.out.println(os3.peek());

        // Testing all random numbs
        OStack os4 = new OStack();
        os4.push(11); os4.push(19); os4.push(12); os4.push(2); os4.push(1515); 
        os4.push(333); os4.push(198); os4.push(33); os4.push(33); os4.push(42); 
        System.out.println(os4.peek());

        // Testing 1 number
        OStack os5 = new OStack();
        os5.push(42);
        System.out.println(os5.peek());        
    }
}
