// min heap
import java.lang.Math;

public class Tree{
    Node head;
    Tree(int i){
        head = new Node(i);
    }
    
    // Get Minimum item //
    public int min(){
        return head.data;
    }

    public void insert(int d){
        Node newNode = new Node(d);
        Node start = head;
        while(start.right != null){
            start = start.right;
        }
        start.right = head;
    }

    // Inorder Traversal //
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

    // Preorder Traversal //
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

    // Postorder Traversal //
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