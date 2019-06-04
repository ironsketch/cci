public abstract class Employee{
    private int number;
    private String firstName;
    private String lastName;
    private boolean isOnCall;
    Employee(int number, String firstName, String lastName){
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isOnCall = false;
    }
    public boolean onCall(){return isOnCall;}
    public void setCall(boolean call){isOnCall = call;}
    public String toSring(){
        return firstName + " " + lastName;
    }
}
