public abstract class Animal{
    private String name;
    private long date;
    public Animal(String n, long d){
        name = n;
        date = d;
    }

    public long getDate(){
        return date;
    }

    @Override
    public String toString(){
        return "Pet name: " + this.name;
    }
}
