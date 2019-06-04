Node public succ(Node n){
    if(n.parent == null){
        return n.left;
    } else if(n == n.parent.left){
        return n.parent.right;    // These two solve the mini trees
    } else {
        // Now I need to solve the problem for any tree size.
        
    }
}


/**
 *              1
 *            /   \
 *          2      3
 *        /  \    /  \ 
 *      4    5    6    7
 *    / |   | \  | \   | \
 *  8   9  10 11 12 13 14 15
 */
