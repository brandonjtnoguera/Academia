
/**
 * This class represents a node in a tree
 * @author  Brandon Tenorio
 */
public class TreeNode<T> {
    protected T data;
    protected TreeNode<T> left;
    protected TreeNode<T> right;

    /**
     * Parameterized constructor
     * @param data the data that the node holds
     */
    public TreeNode(T data){
        this.data = data;
        left = right = null;
    }

    /**
     * Parameterized constructor used to create a deep copy of a tree node
     * @param node a deep copy of a tree node
     */
    public TreeNode(TreeNode<T> node){
        this.data = node.data;
        this.left = node.left;
        this.right = node.right;
    }

    /**
     * Returns this treeNode's data
     * @return the data of current tree node
     */
    public T getData(){
        return data;
    }

}
