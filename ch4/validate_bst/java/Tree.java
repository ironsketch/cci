import java.util.*;

public class Tree{
    Node head;
    String order;
    Tree(){
        head = null;
        order = "";
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
    public String inOrder(){
        inOrderR(head);
        String tmp = order;
        order = "";
        return tmp;
    }
    public void inOrderR(Node n){
        if(n.left != null)
            inOrderR(n.left);
        order += " " + String.valueOf(n.data);
        if(n.right != null)
            inOrderR(n.right);
    }
}
    
