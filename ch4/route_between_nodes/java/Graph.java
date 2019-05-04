import java.util.*;
public class Graph{
    ArrayList<Node> nodes;

    Graph(int firstNode){
        nodes = new ArrayList<Node>();
        Node n = new Node(firstNode);
        nodes.add(n);
    }
    public void addNode(int i){
        Node n = new Node(i);
        nodes.add(n);
    }
    public void p(){
        for(int i = 0; i < nodes.size(); i++){
            System.out.printf("Node (%d)\n", nodes.get(i).data);
            System.out.printf("    Children: ");
            for(int j = 0; j < nodes.get(i).children.size(); j++){
                System.out.printf("%d  ", nodes.get(i).children.get(j).data);
            }
            System.out.println("");
        }
    }
    public Node getNode(int search){
        for(int i = 0; i < nodes.size(); i++){
            if(nodes.get(i).data == search)
                return nodes.get(i);
        }
        return null;
    }
    public boolean route(Node n1, Node findMe){
        return routeR(n1, findMe, false);
    }
    public boolean routeR(Node n1, Node findMe, boolean answer){
        n1.visited = true;
        if (n1.data == findMe.data)
            answer = true;
        else {
            for(int i = 0; i < nodes.get(nodes.indexOf(n1)).children.size(); i++){
                answer = routeR(nodes.get(nodes.indexOf(n1)).children.get(i), findMe, answer);
            }
        }
        return answer;
    }
    public void fixVisited(){
        for(int i = 0; i < nodes.size(); i++){
            
        }
    }
}
