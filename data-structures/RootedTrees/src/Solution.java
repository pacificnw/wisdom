
public class Solution {

	public static void main(String[] arguments) {
		
		/*
		 * This is to represent the following tree
		 * 
		 *              +
		 *           /     \
		 *          *       ^
		 *         / \     / \
		 *        3   7   4   2
		 */
		
		SibTree tree = new SibTree();
		
		SibTreeNode node1 = new SibTreeNode("+");
		
		SibTreeNode node2 = new SibTreeNode("*");
		SibTreeNode node4 = new SibTreeNode("3");
		SibTreeNode node5 = new SibTreeNode("7");
		
		SibTreeNode node3 = new SibTreeNode("^");
		SibTreeNode node6 = new SibTreeNode("4");
		SibTreeNode node7 = new SibTreeNode("2");
		
		node2.addChild(node4);
		node4.addSibling(node5);
		
		node3.addChild(node6);
		node6.addSibling(node7);
		
		node1.addChild(node2);
		node2.addSibling(node3);
		
		tree.root = node1;
		
		tree.traversePreOrder();
		
		tree.traversePostOrder();
		
		tree.traverseInOrder();
		
	}
}
