public class Tile{
    boolean bomb;
    boolean visited;
    String c;
    int num;
    Tile(boolean bomb, String c, int num){
        this.bomb = bomb;
        this.visited = false;
        this.c = c;
        this.num = num;
    }
    public void setVisit(boolean visited){
        this.visited = visited;
    }
    public String toString(){
        return " " + String.valueOf(c) + " ";
    }
}
