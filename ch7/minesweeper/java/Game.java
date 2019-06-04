import java.util.*; 

public class Game{
    int size;
    double difficulty;
    int reveals;
    ArrayList< ArrayList<Tile>> board;
    ArrayList<Pair <Integer, Integer>> bombs;

    Game(int size, double difficulty){
        this.size = size;
        this.difficulty = difficulty;
        this.reveals = 0;
        board = new ArrayList< ArrayList<Tile>>();
        bombs = new ArrayList<Pair <Integer, Integer>>();
        createBoard();
        play();
    }
    public void play(){
        Pair<Integer, Integer> input;
        boolean won = false;
        boolean bomb = false;
        while(!won && !bomb){
            //System.out.print("\033[H\033[2J");  
            //System.out.flush();
            p();
        //    System.out.printf("Reveals Left: %d\n", reveals);
            input = userInput();
            while(input.a < 0 || input.a >= size || input.b < 0 || input.b >= size)
                input = userInput();
            bomb = clear(input);
            won = winCheck();
        }
        if(!bomb && won)
            System.out.println("You won!");
        else
            System.out.println("You got blown up!");
        debugP();
    }
    private boolean clear(Pair<Integer, Integer> input){
        if(board.get(input.a).get(input.b).num == 9)
            return true;
        
        if(board.get(input.a).get(input.b).num == 0){
            // Stack array of Tiles and locations
            ArrayList<Pair<Tile, Pair<Integer, Integer>>> stack = new ArrayList<Pair<Tile, Pair<Integer, Integer>>>();

            // First pair of Tile and location
            Pair<Tile, Pair<Integer, Integer>> p = 
                new Pair<Tile, Pair<Integer, Integer>>
                (board.get(input.a).get(input.b), input);

            // Added to stack
            stack.add(p);
            reveals--;
            while(stack.size() > 0){
                Pair<Tile, Pair<Integer, Integer>> tmp;
                Pair<Integer, Integer> loc;
                p = stack.get(0);
                p.a.c = String.valueOf(p.a.num);
                p.a.visited = true;
                stack.remove(0);
                if(p.a.num == 0){
                    // Above
                    if(p.b.b - 1 >= 0 && !board.get(p.b.a).get(p.b.b - 1).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a, p.b.b - 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a).get(p.b.b - 1), loc);
                        stack.add(tmp);
                    }
                    // Above Right
                    if(p.b.b - 1 >= 0 && p.b.a + 1 < size && !board.get(p.b.a).get(p.b.b - 1).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a + 1, p.b.b - 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a + 1).get(p.b.b - 1), loc);
                        stack.add(tmp);
                    }
                    // Right
                    if(p.b.a + 1 < size && !board.get(p.b.a + 1).get(p.b.b).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a + 1, p.b.b);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a + 1).get(p.b.b), loc);
                        stack.add(tmp);
                    }
                    // Right Bottom
                    if(p.b.a + 1 < size && p.b.b + 1 < size && !board.get(p.b.a + 1).get(p.b.b).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a + 1, p.b.b + 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a + 1).get(p.b.b + 1), loc);
                        stack.add(tmp);
                    }
                    // Bottom
                    if(p.b.b + 1 < size && !board.get(p.b.a).get(p.b.b + 1).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a, p.b.b + 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a).get(p.b.b + 1), loc);
                        stack.add(tmp);
                    }
                    // Bottom Left
                    if(p.b.b + 1 < size && p.b.a - 1 >= 0 && !board.get(p.b.a).get(p.b.b + 1).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a - 1, p.b.b + 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a - 1).get(p.b.b + 1), loc);
                        stack.add(tmp);
                    }
                    // Left
                    if(p.b.a - 1 >= 0 && !board.get(p.b.a - 1).get(p.b.b).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a - 1, p.b.b);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a - 1).get(p.b.b), loc);
                        stack.add(tmp);
                    }
                    // Left Top
                    if(p.b.a - 1 >= 0 && p.b.b - 1 >= 0 && !board.get(p.b.a - 1).get(p.b.b).visited){
                        loc = new Pair<Integer, Integer>
                            (p.b.a - 1, p.b.b - 1);
                        tmp = new Pair<Tile, Pair<Integer, Integer>>
                            (board.get(p.b.a - 1).get(p.b.b - 1), loc);
                        stack.add(tmp);
                    }
                }
            }
        } else {
            board.get(input.a).get(input.b).c = 
                String.valueOf(board.get(input.a).get(input.b).num);
        }
        return false;
    }
    private void resetVisited(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board.get(i).get(j).visited = false;
            }
        }
    }
    private boolean winCheck(){
        return reveals == 0;
    }
    public Pair<Integer, Integer> userInput(){
        System.out.println("Enter in a coordinate y x");
        Scanner s = new Scanner(System.in);
        int a = -1;
        int b = -1;
        try{
            a = s.nextInt();
            b = s.nextInt();
        } catch(Exception e) {
            System.out.println("Invalid");
            p();
        }
        return new Pair<Integer, Integer>(a, b);
    }

    public void p(){
        // Print top
        for(int i = 0; i < size + 1; i++){
            if(i == 0)
                System.out.printf("    ");
            else
                System.out.printf(" %4d ", i - 1);
        }
        System.out.println("");
        for(int i = 0; i < size; i++){
            System.out.printf("%4d", i);
            for(int j = 0; j < size; j++){
                System.out.printf(" %4s ", board.get(i).get(j).c);
            }
            System.out.println("");
        }
        System.out.println("Type in y x coords: 3 8");
    }
    public void debugP(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf(" %d ", board.get(i).get(j).num);
            }
            System.out.println("");
        }
    }
    private void createBoard(){
        for(int i = 0; i < size; i++){
            board.add(new ArrayList<Tile>());
        }

        // Creating bomb locations
        for(int i = 0; i < (size * size * difficulty); i++){
            int a = (int)(Math.random() * size);
            int b = (int)(Math.random() * size);
            Pair<Integer, Integer> tmp = new Pair<Integer, Integer>(a, b);
            bombs.add(tmp);
        }

        // Setting how many tiles need to be cleared
        reveals = (size * size) - bombs.size();

        // Making all tiles blank first
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Tile t = new Tile(false, " ", 0);
                board.get(i).add(t);
            }
        }

        // Updating bombs
        for(int i = 0; i < bombs.size(); i++){
            board.get(bombs.get(i).a).get(bombs.get(i).b).bomb = true;
            board.get(bombs.get(i).a).get(bombs.get(i).b).c = "#";
            board.get(bombs.get(i).a).get(bombs.get(i).b).num = 9;
        }

        // Updating the rest
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board.get(i).get(j).num != 9){
                    int count = 0;
                    // Up
                    if(j - 1 >= 0)
                        if(board.get(i).get(j - 1).num == 9)
                            count++;
                    // Up Right
                    if(j - 1 >= 0 && i + 1 < size)
                        if(board.get(i + 1).get(j - 1).num == 9)
                            count++;
                    // Right
                    if(i + 1 < size)
                        if(board.get(i + 1).get(j).num == 9)
                            count++;
                    // Right Down
                    if(i + 1 < size && j + 1 < size)
                        if(board.get(i + 1).get(j + 1).num == 9)
                            count++;
                    // Down
                    if(j + 1 < size)
                        if(board.get(i).get(j + 1).num == 9)
                            count++;
                    // Down Left
                    if(j + 1 < size && i - 1 >= 0)
                        if(board.get(i - 1).get(j + 1).num == 9)
                            count++;
                    // Left
                    if(i - 1 >= 0)
                        if(board.get(i - 1).get(j).num == 9)
                            count++;
                    // Left Up
                    if(i - 1 >= 0 && j - 1 >= 0)
                        if(board.get(i - 1).get(j - 1).num == 9)
                            count++;
                    board.get(i).get(j).num = count;
                }
                board.get(i).get(j).c = "\u038b";
            }
        }
    }
}
