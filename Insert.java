/*
 * June 18 2019
 * Insert
 * by Lee Jui Chi
 */

public class Insert {
    TreeNode tree;
    TestData testData;
    Inorder inorder= new Inorder();

    public static void main(String[] args) {
        new Insert();
    }

    public Insert() {
        testData = new TestData();
        tree = testData.getTree();
        inorder.showTree(tree);
        System.out.println();
        tree = insertKey(tree, 68);
        inorder.showTree(tree);
        System.out.println();
    }

    public TreeNode insertKey(TreeNode tree, int key) {
        System.out.print(key + " >> ");
        inorder.showTree(tree);
        System.out.println();
        if(tree == null){
            tree = new TreeNode(key, null, null);



        }else if(key < tree.getKey()){
            tree.setLeft(insertKey(tree.getLeft(), key));

        }else{
            tree.setRight(insertKey(tree.getRight(), key));

        }

        /* Complete this part */

        return tree;
    }

}
