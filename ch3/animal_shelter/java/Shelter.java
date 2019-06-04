import java.util.LinkedList; 
import java.util.Queue; 

public class Shelter{
    private Queue<Cat> cats;
    private Queue<Dog> dogs;
    public Shelter(){
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }
    public void enqueue(Cat newCat){
        cats.add(newCat);
    }
    public void enqueue(Dog newDog){
        dogs.add(newDog);
    }
    public Animal dequeueAny(){
        if(cats.peek().getDate() > dogs.peek().getDate()){
            return dogs.remove();
        }
        return cats.remove();
    }
    public Cat dequeueCat(){
        return cats.remove();
    }
    public Dog dequeueDog(){
        return dogs.remove();
    }
}
