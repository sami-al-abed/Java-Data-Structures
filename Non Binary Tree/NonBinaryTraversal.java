/**
 * This class contains traversal algorithms used to read values of trees
 */
public class NonBinaryTraversal
{

    public static void nonBinaryTreeTraversal(NoBinaryNode<Integer> root) {
        if (root != null) {
            System.out.println(root.value);
            for ( int i = 0; i < root.children.size(); i++) {
                nonBinaryTreeTraversal(root.children.get(i));
            }
        }
    }

    /**
     * Main function used to test solution
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        StaticIntegerNonBinaryTree testTree1 = new StaticIntegerNonBinaryTree("1 3 2 1 5 0 3 0 4 0");
        nonBinaryTreeTraversal(testTree1.root);
    }
}
