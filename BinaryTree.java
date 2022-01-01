public class BinaryTree <type>{
    BinaryTreeNode <type> root;
    int layers = 0;
    public void add(int key , type value) {
        BinaryTreeNode current = root;
        int l = 1;
        // l is counting how many jumps we made to get where we are
        if (root == null){
            root = new BinaryTreeNode<type>(key , value);
            layers = 1;
            return;
        }
        while (current != null){
            if (key > current.key) {
                if (current.right == null){
                    current.right = new BinaryTreeNode<type>(key, value);
                    if (layers <= l){
                        layers = l + 1;
                    }
                    return;
                }
                current = current.right;
                l = l + 1;   
            }
    
            else if (key < current.key) {
                if (current.left == null){
                    current.left = new BinaryTreeNode<type>(key, value);
                    if (layers <= l){
                        layers = l + 1;
                }
                return;
            }
                current = current.left;
                l = l + 1;
        }
    }
}
    public static void main(String[] args) {
        BinaryTree <String> test = new BinaryTree <String> ();
        test.add(12, "test");
        test.add(7,"test left first child");
        test.add(4,"test left second child");
        test.add(18,"test right first child");
        test.add(42, "test right second child");
        System.out.print(test);
    }

    public String toString() {
        // highest number printed first all the way to the right
        // we go down one line and go spaces to the left and then print second highest number, highest numbers parent
        // go down another one line and go spaces to the right(since its bigger) and the parent of this would be 18
        // we can say we can print a parent if theres no right children
        return toString(root, 0) ;
}
    public String toString(BinaryTreeNode current, int l) {
        String output = ""; 
        if (current.right != null) {
            output +=  toString(current.right, l + 1) ; 
        }
        for (int i = 0; i < l ; i += 1){
            output += "  ";
        }
        output +=   current.toString() + "\n";

        if (current.left != null) { 
            output +=  toString(current.left, l + 1);
        }
        return output;
        
    }
}


