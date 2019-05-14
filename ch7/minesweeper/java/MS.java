import java.util.*;

public class MS{
    public static void main(String[] args){
        System.out.println("What size do you want this game to be?");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Difficulty? (.1 - .9)");
        double difficulty = s.nextDouble();
        Game g = new Game(size, difficulty);
    }
}
