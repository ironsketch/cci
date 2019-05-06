public class Tree{
    Node head;
    Tree(){
        head = null;
    }
    public void add(int i){
        Node nn = new Node(i);
        addR(head, nn);
    }
    public void addR(Node start, Node nn){
        if(start != null){
            if(nn.data > start.data && start.right == null)
                start.right = nn;
            else if(nn.data < start.data && start.left == null)
                start.left = nn;
            else if(nn.data > start.data)
                addR(start.right, nn);
            else if(nn.data < start.data)
                addR(start.left, nn);
        }
    }
    public boolean isBalanced(){
        return isBalR(head) > 1;
    }
    public int isBalR(Node n){
        if(n.left != null)
            return 1 + isBalR(n.left);
        if(n.right != null)
            return -1 + isBalR(n.left);
        else
            return 0;
    }
}
