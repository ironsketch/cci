public class Director extends Employee{
    private int priority;
    Director(int number, String firstName, String lastName){
        super(number, firstName, lastName);
        priority = 2;
    }
    public Integer getPriority(){return priority;}
}
