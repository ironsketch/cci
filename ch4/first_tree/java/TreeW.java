// min heap
import java.lang.Math;

public class Tree{
    Node head;
    int elements;
    Tree(int i){
        head = new Node(i);
        elements = 1;
    }
    public int min(){
        return head.data;
    }

    private int height(){
        return (int)Math.floor(Math.sqrt(elements)) + 1;
    }

    // Inserting by breadth //
    /*public void insert(int i){
        Node newNode = new Node(i);
        insertR(1, newNode, head);
        bubble(head);
        elements++;
    }

    public void insertR(int h, Node newNode, Node start){
        if(start.left == null && 2 * h == elements + 1){
            start.left = newNode;
        } else if(start.right == null && 2 * h + 1 == elements + 1){
            start.right = newNode;
        } else if(start.left != null || start.right != null){
            if(start.left != null)
                insertR(h * 2, newNode, start.left);
            if(start.right != null)
                insertR(h * 2 + 1, newNode, start.right);
        }
    }*/

    public void bubble(Node start){
    }

    public void swap(Node n1, Node n2){
        int tmp = n1.data;
        n1.data = n2.data;
        n2.data = tmp;
    }

    public void inorder(){
        inorderR(head);
        System.out.println("");
    }
    public void inorderR(Node start){
        if(start.left != null){
            inorderR(start.left);
        }
        System.out.print(start.data);
        System.out.print(" ");
        if(start.right != null){
            inorderR(start.right);
        }
    }
    public void preorder(){
        preorderR(head);
        System.out.println("");
    }
    public void preorderR(Node start){
        System.out.print(start.data);
        System.out.print(" ");
        if(start.left != null){
            preorderR(start.left);
        }
        if(start.right != null){
            preorderR(start.right);
        }
    }
    public void postorder(){
        postorderR(head);
        System.out.println("");
    }
    public void postorderR(Node start){
        if(start.left != null){
            postorderR(start.left);
        }
        if(start.right != null){
            postorderR(start.right);
        }
        System.out.print(start.data);
        System.out.print(" ");
    }
}
