

public class TreeNode {
    private String data;
    private int key;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int key_, TreeNode left_, TreeNode right_){
        key = key_;
        left = left_;
        right = right_;
    }

    public int getKey() {
        return key;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode node) {
        left = node;
    }

    public void setRight(TreeNode node) {
        right = node;
    }

    public void setKey(int key_) {
        key = key_;
    }

}
