public class ThreeInOne{
    public static void main(String[] args){
        Stacks<Integer> s = new Stacks<Integer>();
        s.push(1, 0);
        s.push(1, 2);
        s.push(1, 4);
        s.push(2, 55);
        s.push(2, 66);
        s.push(2, 77);
        s.push(3, 1984);
        s.push(1, 5);
        s.push(3, 2000);
        s.p(1);
        s.p(2);
        s.p(3);
        System.out.println("");
        System.out.println(s.top(1));
        s.pop(1);
        System.out.println(s.top(2));
        s.pop(2);
        System.out.println(s.top(3));
        s.pop(3);
        System.out.println("");
        s.p(1);
        s.p(2);
        s.p(3);
    }
}
