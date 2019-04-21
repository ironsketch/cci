public class Plates{
    public static void main(String[] args){
        Stacks<Integer> s = new Stacks<Integer>(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.p();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.top());
    }
}
