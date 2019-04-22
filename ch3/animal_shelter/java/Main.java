import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Shelter shelter = new Shelter();
        boolean notDone = true;
        while(notDone){
            System.out.println("Enter a cat, dog, adopt or exit (1,2,3,4)");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 1){
                System.out.println("Enter Cat Name");
                String name = input.nextLine();
                Cat tmpCat = new Cat(name, System.currentTimeMillis());
                shelter.enqueue(tmpCat);
            } else if(choice == 2){
                System.out.println("Enter Dog Name");
                String name = input.nextLine();
                Dog tmpDog = new Dog(name, System.currentTimeMillis());
                shelter.enqueue(tmpDog);
            } else if(choice == 3){
                System.out.println("Adopt a dog or cat or either (1,2,3)");
                choice = input.nextInt();
                input.nextLine();
                if(choice == 1){
                    Dog d = shelter.dequeueDog();
                    System.out.printf("\nYou adopted %s!\n", d);
                } else if(choice == 2){
                    Cat c = shelter.dequeueCat();
                    System.out.printf("\nYou adopted %s!\n", c);
                } else {
                    Animal a = shelter.dequeueAny();
                    System.out.printf("\nYou adopted %s!\n", a);
                }
            } else if(choice == 4){
                notDone = false;
            } else {
                System.out.println("\nThat wasn't an option :P\n");
            }
        }
    }
}
