import java.util.*;

/**
 * This is a MorseCodeTree which is specifically used for the conversion of morse code to english It relies on a root (reference to root of the tree)
 * The root is set to null when the tree is empty.
 * The class uses an external generic TreeNode class which consists of a reference to the data and a reference to the left and right child.
 * The TreeNode is parameterized as a String, TreeNode This class uses a private member root (reference to a TreeNode) The constructor will call the buildTree method
 * @author Brandon Tenorio
 */
public class MorseCodeTree implements LinkedConverterTreeInterface<String> {
    private TreeNode<String> root;

    public MorseCodeTree(){
        buildTree();
    }

    @Override
    public TreeNode<String> getRoot() {
        return root;
    }

    @Override
    public void setRoot(TreeNode<String> newNode) {
        root = newNode;
    }

    @Override
    public LinkedConverterTreeInterface<String> insert(String code, String result) {
        // TODO
        return null;
    }

    @Override
    public void addNode(TreeNode<String> root, String code, String letter) {
        // TODO
    }

    @Override
    public String fetch(String code) {
        // TODO
        return null;
    }

    @Override
    public String fetchNode(TreeNode<String> root, String code) {
        // TODO
        return null;
    }

    @Override
    public void buildTree() {
        root = new TreeNode<String>("");
        // TODO INSERT THE NODES
    }

    @Override
    public ArrayList<String> toArrayList() {
        return null;
    }

    @Override
    public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
        // TODO
    }


    @Override
    public MorseCodeTree delete(String data) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public MorseCodeTree update() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
