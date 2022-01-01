public class BinaryTreeNode <type> {
    BinaryTreeNode <type> left;
    BinaryTreeNode <type> right;
    int key;
    type value;

    public static void main(String[] args) {
        BinaryTreeNode <String> B = new BinaryTreeNode <String> (52 , "test" );
        System.out.print(B);
      
        
    }
    
    public BinaryTreeNode(int key, type value){
        this.key = key;
        this.value = value;
    }

    public BinaryTreeNode(BinaryTreeNode <type> left, BinaryTreeNode <type> right, int key,  type value){
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return key + " ; " + value.toString();
        
        
   }
   
}
