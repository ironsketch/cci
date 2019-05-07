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
        return isBalR(head);
    }
    public boolean isBalR(Node n){
        int l;
        int r;
        if(n == null)
            return true;
        l = height(n.left);
        r = height(n.right);
        if(Math.abs(l - r) <= 1 && isBalR(n.left) && isBalR(n.right))
            return true;
        return false;
    }
    public int height(Node n){
        if(n == null)
            return 0;
        return 1 + Math.max(height(n.left), height(n.right));
    }
}
