public class Manager extends Employee{
    private int priority;
    Manager(int number, String firstName, String lastName){
        super(number, firstName, lastName);
        priority = 1;
    }
    public Integer getPriority(){return priority;}
}
