/*
 * June 18 2019
 * Delete
 * by Lee Jui Chi
 */

public class Delete {
    TreeNode tree;
    TestData testData;
    Inorder inoder = new Inorder();

    public static void main(String[] args) {
        new Delete();
    }

    public Delete() {
        testData = new TestData();
        tree = testData.getTree();
        inoder.showTree(tree);
        System.out.println();
        tree = deleteKey(tree, 32);
        inoder.showTree(tree);
        System.out.println();
    }

    public TreeNode deleteKey(TreeNode tree, int key) {
        System.out.print(key + " >> ");
        inoder.showTree(tree);
        System.out.println();

        if (tree != null) {
            if (key < tree.getKey()) {
                tree.setLeft(deleteKey(tree.getLeft(), key));

            } else if (key > tree.getKey()) {
                tree.setRight(deleteKey(tree.getRight(), key));

            } else {
                if (tree.getLeft() == null) {
                    tree = tree.getRight();
                } else if (tree.getRight() == null) {
                    tree = tree.getLeft();
                } else {
                    tree.setKey(minValue(tree.getRight()));
                }
            }

        }
        return tree;
    }

    public int minValue(TreeNode tree) {
        int minv = tree.getKey();
        while (tree.getLeft() != null) {
            minv = tree.getLeft().getKey();
            tree = tree.getLeft();
        }
        return minv;
    }
}