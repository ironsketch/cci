import java.util.*;

public class Tree{
    Node head;
    Tree(){
        head = null;
    }
    public void add(int i){
        Node nNode = new Node(i);
        if(head == null)
            head = nNode;
        else
            addR(head, nNode, 1);
    }
    public void addR(Node start, Node nNode, int i){
        if(start != null){
            if(nNode.data > start.data && start.right == null){
                start.right = nNode;
            }
            else if(nNode.data < start.data && start.left == null){
                start.left = nNode;
            }
            else if(nNode.data > start.data)
                addR(start.right, nNode, i++);
            else if(nNode.data < start.data)
                addR(start.left, nNode, i++);
        }
    }
    public void p(){
        Node tmp = head;
        pR(tmp);
        System.out.println("");
    }
    public void pR(Node n){
        if(n.left != null){
            pR(n.left);
        }
        System.out.printf("%d ", n.data);
        if(n.right != null){
            pR(n.right);
        }
    }
    public ArrayList<LinkedList <Node>> depth(){
        ArrayList<LinkedList <Node>> ll = new ArrayList<LinkedList <Node>>();
        ll.add(new LinkedList<Node>());
        ArrayList<Node> q = new ArrayList<Node>();
        Node start = head;
        int count = 0;
        int height = 0;
        q.add(start);
        while(q.size() > 0){
            Node tmp = q.remove(0);
            count++;
            if(tmp.left != null)
                q.add(tmp.left);
            if(tmp.right != null)
                q.add(tmp.right);
            if(count / 2 > height){
                height++;
                ll.add(new LinkedList<Node>());
            }
            ll.get(count / 2).add(tmp);
        }
        return ll;
    }
}
    
