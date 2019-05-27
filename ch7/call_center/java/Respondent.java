public class Respondent extends Employee{
    private int priority;
    Respondent(int number, String firstName, String lastName){
        super(number, firstName, lastName);
        priority = 0;
    }
    public Integer getPriority(){return priority;}
}
