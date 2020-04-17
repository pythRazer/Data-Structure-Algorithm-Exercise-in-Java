
public class TestData {
    TreeNode tree;

	/*
	public TestData() {
		tree = new TreeNode("A",
			new TreeNode("B",
				new TreeNode("D", null, null),
				new TreeNode("E",
					new TreeNode("H", null, null),
					new TreeNode("I", null, null)
				)
			),
			new TreeNode("C",
				new TreeNode("F", null, null),
				new TreeNode("G", null, null)
			)
		);
	}
	*/

    public TestData() {
        tree = new TreeNode(44,
                new TreeNode(17,
                        new TreeNode(8, null, null),
                        new TreeNode(32,
                                new TreeNode(28,
                                        null,
                                        new TreeNode(29, null, null)
                                ),
                                null
                        )
                ),
                new TreeNode(88,
                        new TreeNode(65,
                                new TreeNode(54, null, null),
                                new TreeNode(82,
                                        new TreeNode(76,
                                                null,
                                                new TreeNode(80, null, null)
                                        ),
                                        null
                                )
                        ),
                        new TreeNode(97,
                                new TreeNode(93, null, null),
                                null)
                )
        );
    }

    public TreeNode getTree() {
        return tree;
    }

}
