/*
 * June 18 2019
 * Inorder
 * by Lee Jui Chi
 */

public class Inorder {
    TreeNode tree;
    TestData testData;

    public static void main(String[] args) {
        Inorder in = new Inorder();
        in.execution();
    }

    public void execution() {
        testData = new TestData();
        tree = testData.getTree();
        showTree(tree);
    }

    public void showTree(TreeNode tree) {
        if(tree != null) {

            if(tree.getLeft() != null){
                showTree(tree.getLeft());
            }

            visit(tree);
            if(tree.getRight() != null){
                showTree(tree.getRight());
            }






            /* Complete this part */

        }
    }

    public void visit(TreeNode tree) {
        System.out.print(tree.getKey() + " ");
    }

}
