import java.util.*;
public class Node{
    // Unique Identifier
    public int data;
    public boolean visited;
    public ArrayList<Node> children;
    Node(int d){
        data = d;
        visited = false;
        children = new ArrayList<Node>();
    }
    public void addChild(Node n){
        children.add(n);
    }
}
